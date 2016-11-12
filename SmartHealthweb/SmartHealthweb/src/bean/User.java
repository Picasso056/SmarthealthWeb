
package bean;
import java.util.*;
import java.util.Date;
import java.sql.*;

import dataObject.EndUserDAO;
import dataObject.smarthealthDAO;

/*CLASS : USER
 * DESCRIPTION : BASE CLASS FOR ADMIN, MODERATOR AND PERSON 
 */

public abstract class User
{
	/*
	 * DATA MEMBER FOR CLASS USER
	 */
	private  String primary_email;
	private  String secondary_email;
	private  String username;
	private  String password;
	private String reenter_password;
	private  String first_name;
	private  String last_name;
	private  java.sql.Date date;//to be used later on in the project
	private  String about_me;
	private ArrayList<String> URLs;
	private String user_type;
	private int is_active;
	private  String postal_address;
	private String postal_address1;
	private  String postal_address2;
	private  String postal_address3;
	private  String postal_address4;
	private Boolean logged_in;
	private  String URL1;
	private  String URL2;
	private String URL3;
	private int usertypeid;
	
	/*
	 * CONSTRUCTORS AND SETTER AND GETTER FOR CLASS USER
	 */
	User()
	{
		
	}
	User(String userType)
	{
		date = new java.sql.Date((new Date()).getTime());
		user_type = userType;
		
		if(userType.equals("NEW"))
			setUsertypeid(1);
		else if(userType.equals("MOD"))
			setUsertypeid(4);
		
		else if(userType.equals("ADMIN"))
			setUsertypeid(5);
		
		logged_in = false;
		is_active = 1;
		
	}
	
	public User(String user,String password,String email1,String email2,String First_name,String last_name,String about_me,String url1,String url2,String url3,String address,String address1,String address2,String address3,String address4,int status,int id)
	{
	    this.username=user;
		this.password=password;
		this.primary_email=email1;
		this.secondary_email=email2;
		this.first_name=First_name;
		this.last_name=last_name;
		this.about_me=about_me;
		this.URL1=url1;
		this.URL2=url2;
		this.URL3=url3;
		this.postal_address=address;
		this.postal_address1=address1;
		this.postal_address2=address2;
		this.postal_address3=address3;
		this.postal_address4=address4;
		this.is_active=status;
		this.usertypeid = id;
	}
	
	public  void setFirst_name(String First_name) {
		this.first_name = First_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public  void setLast_name(String Last_name) {
		this.last_name = Last_name;
	}

	public java.sql.Date getDate() {
		return date;
	}
	public void setDate(java.sql.Date date1) {
		this.date=date1;
	}
	

	public String getAbout_me() {
		return about_me;
	}

	public  void setAbout_me(String About_me) {
		this.about_me = About_me;
	}

	public ArrayList<String> getURLs() {
		return URLs;
	}

	public void setURLs(ArrayList<String> uRLs) {
		this.URLs = uRLs;
	}

	public  String getUser_type() {
		return user_type;
	}

	public  void setUser_type(String User_type) {
		this.user_type = User_type;
	}

	public int getIs_active() {
		return is_active;
	}

	public  void setIs_active(int Is_active) {
		this.is_active = Is_active;
	}

	public  String getPostal_address() {
		return postal_address;
	}

	public void setPostal_address(String Postal_address) {
		this.postal_address = Postal_address;
	}

	public Boolean getLogged_in() {
		return logged_in;
	}

	public void setLogged_in(Boolean logged_in) {
		this.logged_in = logged_in;
	}

	public String getURL1() {
		return URL1;
	}

	public void setURL1(String uRL1) {
		this.URL1 = uRL1;
	}

	public  String getURL2() {
		return URL2;
	}

	public  void setURL2(String uRL2) {
		this.URL2 = uRL2;
	}

	public String getURL3() {
		return URL3;
	}

	public void setURL3(String uRL3) {
		this.URL3 = uRL3;
	}
	
	public String getPrimary_email() {
		return primary_email;
	}

	public void setPrimary_email(String Primary_email) {
		this.primary_email = Primary_email;
	}

	public String getSecondary_email() {
		return secondary_email;
	}

	public  void setSecondary_email(String Secondary_email) {
		this.secondary_email = Secondary_email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String Username) {
		this.username = Username;
	}

	public  String getPassword() {
		return password;
	}

	public  void setPassword(String Password) {
		this.password = Password;
	}

	public String getReenter_password() {
		return reenter_password;
	}

	public void setReenter_password(String reenter_password) {
		this.reenter_password = reenter_password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public  int getUsertypeid() {
		return usertypeid;
	}

	public void setUsertypeid(int Usertypeid) {
		this.usertypeid = Usertypeid;
	}

	public  String getPostal_address1() {
		return postal_address1;
	}

	public void setPostal_address1(String postal_address1) {
		this.postal_address1 = postal_address1;
	}

	public String getPostal_address2() {
		return postal_address2;
	}

	public void setPostal_address2(String postal_address2) {
		this.postal_address2 = postal_address2;
	}

	public  String getPostal_address3() {
		return postal_address3;
	}

	public void setPostal_address3(String postal_address3) {
	this.postal_address3 = postal_address3;
	}

	public  String getPostal_address4() {
		return postal_address4;
	}

	public  void setPostal_address4(String postal_address4) {
		this.postal_address4 = postal_address4;
	}

	
}
