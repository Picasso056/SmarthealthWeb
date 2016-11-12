package bean;

/*
 * CLASS : ADMIN
 * SUPERCLASS : USER
 * DESCRIPTION : BEAN CLASS FOR ADMIN TYPE OF USER
 */

import connector.AdminConnector;

public class Admin extends User{

	/* MEMBER FUNCTIONS OF CLASS ADMIN
	 */
	private String contact;
	private final static String type ="ADMIN";
	
	
	/*CONSTURUCTOR AND SETTER AND GETTER OF CLASS ADMIN
	 * 
	 */
	public Admin()
	{
		super(type);
	}	
	
	public Admin(String user,String password,String email1,String email2,String first_name,String last_name,String about_me,String url1,String url2,String url3,String address,String address1,String address2,String address3,String address4,int status,int karma,String contact)
	{
		super(user,password,email1, email2,first_name,last_name,about_me,url1,url2,url3,address,address1,address2,address3,address4,karma,status);
		this.contact=contact;
		
	}
	
	public void update_profile()
	{

		AdminConnector.update_profile();
	}
	
	public  String getContact() {
		return contact;
	}

	public  void setContact(String Contact) {
		this.contact = Contact;
	}
}