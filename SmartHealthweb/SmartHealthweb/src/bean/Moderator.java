package bean;

import connector.ModeratorConnector;


/*CLASS :MODERATOR
 * SUPERCLASS : USER
 * DESCRIPTION : MODEL CLASS FOR MODERATOR TYPE OF USER
 * 
 */
public class Moderator extends User{

	/*
	 * DATA MEMBER FOR CLASS MODERATOR
	 */
	private  String qualification=" ";
	private String contact;
	
	
	/*
	 * CONSTRUCTOR AND GETTER AND SETTER FOR CLASS MODERATOR
	 * 
	 */
	public Moderator()
	{
		super("MOD");
	
	}
	
	public Moderator(String user,String password,String email1,String email2,String first_name,String last_name,String about_me,String url1,String url2,String url3,String address,String address1,String address2,String address3,String address4,int status,int karma,String contact)
	{
		super(user,password,email1, email2,first_name,last_name,about_me,url1,url2,url3,address,address1,address2,address3,address4,karma,status);
		this.contact=contact;
	
	}
	
	
	public void update_profile()
	{
		ModeratorConnector.update_profile();
	}
	
	public String getQualification() {
		return qualification;
	}
	public  void setQualification(String Qualification) {
		this.qualification = Qualification;
	}
	public String getContact() {
		return contact;
	}
	public  void setContact(String Contact) {
		this.contact = Contact;
	}
}