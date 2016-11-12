/**************************************************************



Project-SmartHealth assignment2
Mayank Gupta(MT16030)
Tushar Jain(MT16056)



**************************************************************/





package connector;

import java.util.*;


import bean.Admin;
import bean.Forum;
import bean.Health;
import bean.Moderator;
import bean.Person;
import bean.User;

import dataObject.AdminDAO;
import dataObject.EndUserDAO;
import dataObject.ModeratorDAO;
import dataObject.Request;
import dataObject.smarthealthDAO;

public class smartHealth 
{
	public static ArrayList<User> User_array;
	public static String type;
	private static User current_user ;
	
	public static void set_user(User user)
	{
		current_user = user;
	}
	public static User get_user()
	{
		return current_user;
	}
	public static void delete_profile()
	{

		//User.setIs_active(0);
	/*	Request r=new Request();
		r.delete_entry(User.getPrimary_email());
		if(current_user instanceof Person)
			EndUserDAO.updateEndUser((Person)current_user);
		
		else if(current_user instanceof Admin)
			AdminDAO.updateAdmin((Admin)current_user);
		
		else if(current_user instanceof Moderator)
			ModeratorDAO.updateModerator((Moderator)current_user);
			*/

	}
	
	public static Scanner in = new Scanner(System.in);
	
	//This is a login function where email id and password will be asked to login
	public static void login()
	{
	/*	int input;
		System.out.print("Enter the email id: ");
		String user = in.next();
		
		System.out.print("Enter the password: ");
		String pwd = in.next();
		
		if(smarthealthDAO.authenticatelogin(user,pwd) == true)
		{
			
			while(true){
			int flag=1;
			System.out.println("Enter 1 to delete the profile\nEnter 2 to update profile\nEnter 3 to view profile\nEnter 0 to logout");
			if(current_user instanceof Person)
			{
				System.out.println("Enter 4 to send Friend request\nEnter 5 to View received Friend requests\nEnter 6 to View sent request\nEnter 7 to view friends");
				System.out.println("Enter 8 for update your health data\nEnter 9 to POST or to COMMENT on a POST");
			}
			if(current_user instanceof Moderator)
			{
				System.out.println("Enter 4 to create FORUM");
			}
			input = in.nextInt();
			in.nextLine();
						
			
			switch(input)
			{
				case 1: 
						delete_profile();
						//current_user.show();
						flag=0;
						break;					
				case 2: 
						current_user.update_profile();
	//current_user.show();
						
						break;
				case 3: if(current_user instanceof Person)
				{
					EndUserView.show();
				}
				else if(current_user instanceof Moderator)
				{
					ModeratorView.show();
				}
				else if(current_user instanceof Admin)
				{
					AdminView.show();
				}
						break;
						
				case 4:if(current_user instanceof Person){ 
					current_user.request_send();
						break;}
				else if(current_user instanceof Moderator)
				{
					Forum f=new Forum();
					f.getForumdata();
					break;
				}
				case 5: current_user.request_received();
						
						break;
				case 6:current_user.cancel_request();
						break;
				case 7: current_user.view_friends();
						break;
				case  8:Health.update_health();
				break;
				case 9:PersonConnector.forumpost();
					break;
				case 0: flag=0;
					break;
				default: System.out.println("Wrong input");
				
			}
			if(flag==0)
				break;
			}
		}
		
		else
			System.out.println("Wrong username/Password");*/
		
	}
	
	
	public static void main(String args[])
	{
		EndUserConnector p;
		int input;
		
		while(true)
		{	
			System.out.println("Enter 1 for login\nEnter 2 for register as an end user");
			System.out.println("Enter 3 for register as a Moderator\nEnter 4 to register as an admin");
		
			input = in.nextInt();
			in.nextLine();
			switch(input)
			{
				case 1: login();
						break;
				
				case 2:
						p = new PersonConnector();
						p.register();
						
						System.out.println("*****Account Succesfully Registered*****");
					//	p.show();
						break;
						
				case 3: 
						p = new ModeratorConnector();
						p.register();
						
						System.out.println("*****Account Succesfully Registered*****");
					//	p.show();
						break;
						
				case 4: 
						p = new AdminConnector();
						p.register();
						
						System.out.println("*****Account Succesfully Registered*****");
					//	p.show();
						break;
				
				default: System.out.println("Wrong input");
				
			}	
		}

	}
}