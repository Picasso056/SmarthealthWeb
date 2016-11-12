package connector;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import dataObject.EndUserDAO;
import dataObject.ForumDAO;
import dataObject.HealthDAO;
import dataObject.PostDAO;
import dataObject.Request;
import bean.Forum;
import bean.Health;
import bean.Person;
import bean.User;

public class PersonConnector extends EndUserConnector{

	static Scanner in=new Scanner(System.in);
	public static void request_send(Person person)
	{
		String email_id;
		System.out.println("Enter the email id of user");
		email_id=in.next();
		if(email_id.equals(person.getPrimary_email()))
		{
			System.out.println("You cannot send request to yourself");
			return;
		}
		Request request=new Request();
		
		if(request.request_search1(email_id)==false)
		{
			System.out.println("User does not exist");
			return;
		}
		else
		{
			//user.user_request_received.add(email_id);
			System.out.println("Do you really want to send friend request to "+email_id+"?\nPress 1 for YES\nAny other for NO ");
			int r=in.nextInt();
			switch(r)
			{
			case 1:
				if(request.request_sent(person)==0)
				{
					System.out.println("Request sent");
				}
				break;
			default: System.out.println("Friend request not sent");
			}
			
		}
	}
	
	public static void request_received(Person person)
	{
		Request request=new Request();
		if(request.request_view(person.getUsername())==null)
			return;
		
		System.out.println("Enter 1 to accept any request\nEnter 2 to reject any request");
		int r;
		String user_requested;
		r=in.nextInt();
		switch(r)
		{
		case 1: System.out.println("Enter the user of whom you want to accept the request");
				user_requested=in.next();
				request.request_confirmed( person,user_requested);
				
				System.out.println("Request Confirmed");
			break;
		case 2:System.out.println("Enter the user of whom you want to reject the request");
				user_requested=in.next();
				request.request_rejected(person.getPrimary_email(), user_requested);
				System.out.println("Request Rejected");
			break;
			default: 
		}
	}
	public static void cancel_request(Person person)
	{
		Request request=new Request();
		if(request.request_view_sent(person)==0)
			return;
		System.out.println("Enter 1 to withdraw any request\nAny other to exit");
		int r;
		String user_requested;
		r=in.nextInt();
		switch(r)
		{
		case 1: System.out.println("Enter the user of whom you want to withdraw the request");
				user_requested=in.next();
				request.request_withdraw(person, user_requested);
				System.out.println("Request Confirmed");
			break;
		
			default: 
		}
		
	}
	public static void view_friends(Person person)
	{
		Request request=new Request();
		ArrayList friends=request.friends_view(person.getUsername());//check
			if(friends.isEmpty())
				return;
			
		System.out.println("Enter 1 to remove any friend\nEnter 2 to view any of your friends data\nAny other to exit");
		int r;
		String user_requested;
		r=in.nextInt();
		switch(r)
		{
		case 1: System.out.println("Enter the user of whom you want to remove");
				user_requested=in.next();
				request.friends_remove( person,user_requested);
				System.out.println("Request Confirmed");
			break;
		case 2: System.out.println("Enter the user of whom you want to view health data");
			user_requested=in.next();
			if(friends.contains(user_requested))
			{
				
				HealthDAO.view_friendhealthdata(user_requested);
			}
			break;
			default: 
		}
		
	}
	//this function is used to update the profile of a person
	public static void update_profile()
	{
/*
		int update;

		System.out.println("Enter 1 to update FirstName\nEnter 2 to update LastName");
		System.out.println("Enter 3 to update password\nEnter 4 to update secondary email");
		System.out.println("Enter 5 to update AboutMe\nEnter 6 to update postal address");
				
		update = in.nextInt();
		in.nextLine();
		
		switch(update)
		{
			case 1:
					System.out.print("Enter the First Name: ");
					Person.setFirst_name(in.next());
					System.out.println("***Succesfully updated***");
					break;
						
			case 2:
					System.out.print("Enter the Last Name: ");
					Person.setLast_name(in.next());
					System.out.println("***Succesfully updated***");
					break;
				
			case 3: 
					System.out.print("Enter the old password: "); 
					String old_pass=in.next();
					if(Person.getPassword().equals(old_pass))
					{
						System.out.print("Enter new password: ");
						String new_pass=in.next();
						System.out.print("Enter password again: ");
						old_pass=in.next();
						if(old_pass.equals(new_pass))
						{
							Person.setPassword(new_pass);
							System.out.println("***Succesfully updated***");
						}
						else
						{
							System.out.println("Password does not match");
							
						}
					}
					else
					{
						System.out.println("Entered wrong password");
					}
					break;
					
			case 4: 
					System.out.print("Enter Secondary email: ");
					Person.setSecondary_email(in.next());
					System.out.println("***Succesfully updated***");
					break;
			
			case 5 :
					System.out.print("Enter About Me text: "); 
					Person.setAbout_me(in.nextLine());
					System.out.println("***Succesfully updated***");
					break;
			
			case 6 :System.out.println("Enter 1: \nEnter 2: \nEnter 3: \nEnter 4: \nEnter 5: \n");
					switch(in.nextInt())
					{
					case 1:
						System.out.print("Enter the Street number: ");
					Person.setPostal_address(in.nextLine());
					System.out.println("***Succesfully updated***");
					break;
					case 2:
						System.out.print("Enter the Street Name: ");
					Person.setPostal_address1(in.nextLine());
					System.out.println("***Succesfully updated***");
					break;
					case 3:
						System.out.print("Enter the Major Municipality: ");
						Person.setPostal_address2(in.nextLine());
						System.out.println("***Succesfully updated***");
						break;
					case 4:
						System.out.print("Enter the Government District: ");
						Person.setPostal_address3(in.nextLine());
						System.out.println("***Succesfully updated***");
						break;
					case 5:
						System.out.print("Enter the postal area: ");
						Person.setPostal_address4(in.nextLine());
						System.out.println("***Succesfully updated***");
						break;
					}
			
					break;
			
			default: System.out.println("Wrong input");
		}
		EndUserDAO.updateEndUser((Person)smartHealth.get_user());*/
		//Person.update_profile();
	}
	public void register()
	{
		/*
		super.register();
		 EndUserDAO.addEnduser((Person)smartHealth.get_user());
		 while(true){
		 System.out.println("Press 1 to enter the Health Data\nPress 2 to exit");
		 if(in.nextInt()==1)
		 {
		 
		 in.nextLine();
		 System.out.println("Enter the name of the problem");
		 String healthname,healthvalue;
		 healthname=in.nextLine();
		 System.out.println("Enter the value");
		 healthvalue=in.nextLine();
		 Health h=new Health(healthname,healthvalue,Person.getUsername());
		 HealthDAO.healthdata();
		 }
		 else
			 return;
		 }	 */
	
	}
	public static void forumpost(User user)
	{
		System.out.println("Enter 1 to POST ques\nEnter 2 to COMMENT on any POST\nEnter 3 to RATE any POST\nEnter 4 to Rate any COMMENT");
		switch(in.nextInt())
		{
		case 1:ForumDAO.showForum();
				System.out.println("Enter the ForumID to where you want to post QUES: ");
				Forum.createPost(user,in.nextInt());
				
			break;
		case 2:System.out.println("Enter the username of whom you want to post comment: ");
		//		Forum.getPostUsingUsername(user,in.next());
			
			break;
		case 3:
			try{ResultSet rs;
				rs=PostDAO.getpost(user);
				while(rs.next())
				{
					System.out.println("ID: "+rs.getString(3)+"   POST: "+rs.getString(4));
				}
				System.out.println("Enter the ID of Post of which you want to rate stars: ");
				int id;
				int stars;
				id=in.nextInt();
				stars=in.nextInt();
				PostDAO.ratingpost(user,id,stars);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			break;
		case 4:
			break;
		}
	}
}