package bean;


import java.text.SimpleDateFormat;
import java.util.*;

import connector.PersonConnector;


/*
 * CLASS : PERSON
 * SUPERCLASS - USER
 * DESCRIPTION : HANDLES ENDUSER FOR SMARTHEALTH
 * 
 */

public class Person extends User
{
	/*
	 * DATA MEMBERS OF CLASS PERSON
	 */

	private static int karma;
	private ArrayList<String> friends;//these some variables will be used later on in the project
	public ArrayList<String> user_request_received;
	private java.sql.Date date;
	private static final String type="NEW";
	
	/*
	 * CONSTRUCTOR ,GETTER AND SETTER FUNCTION OF CLASS PERSON
	 */
	
	public Person()
	{
		super(type);
		karma = 0;
		date = new java.sql.Date((new Date()).getTime());
	}
	
	public Person(String user,String password,String email1,String email2,String first_name,String last_name,String about_me,String url1,String url2,String url3,String address,String address1,String address2,String address3,String address4,int user_type,int status,int karma,java.sql.Date date)
	{
		super(user,password,email1, email2,first_name,last_name,about_me,url1,url2,url3,address,address1,address2,address3,address4,status,user_type);
		this.karma=karma;
		this.date=date;
	}
	
	public void updateUsertype()
	{
		
		long diff = new Date().getTime() - date.getTime()  ;
		
		long days = diff/(24*60*60*1000);
		System.out.println("DAys is"+ days);
		
		if(days > 30 && days < 180)
			setUsertypeid(2);
		
		else if(days >= 180)
			setUsertypeid(3);
		
	}

	
	
	//This method will print the details of the particular end user who has logged in
	public static void updateKarma()
	{
		karma = karma+1;
	}
	
	public static int getKarma() {
		return karma;
	}
	public void setKarma(int karma) {
		this.karma = karma;
	}
	public ArrayList<String> getFriends() {
		return friends;
	}
	public void setFriends(ArrayList<String> friends) {
		this.friends = friends;
	}
	public ArrayList<String> getUser_request_received() {
		return user_request_received;
	}
	public void setUser_request_received(ArrayList<String> user_request_received) {
		this.user_request_received = user_request_received;
	}
	
	
	public void update_profile() {
		// TODO Auto-generated method stub
		PersonConnector.update_profile();
	}

	public static void forumpost() {
		// TODO Auto-generated method stub
		
	}
	/*
	public static ArrayList<String> getFriendsnames()
	{
		
		  Request request=new Request();
				ArrayList<String> friends=request.friends_view(Person.getUsername());
				return friends;
	}*/

	
}