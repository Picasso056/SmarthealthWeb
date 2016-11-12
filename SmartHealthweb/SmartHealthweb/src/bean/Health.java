package bean;

import java.util.Scanner;
import dataObject.HealthDAO;
/*
 * CLASS : HEALTH
 * DESCRIPTION : MODEL CLASS FOR HEALTH
 */


public class Health {
/*
 * DATA MEMBER FOR CLASS HEALTH
 */
	private int datumId;
	private  String username;
	private int propertyid;
	private  String value;
	private java.sql.Date datetime;
	private String name;
	
	static Scanner in=new Scanner(System.in);
	/*
	 * CONSTRUCTOR 
	 */
	public Health()
	{
		
	}
	public Health(String Username)
	{
		this.username=Username;
	}
	public Health(String vname,String Value,String Username)
	{
		this.name=vname;
		this.value=Value;
		this.username=Username;
	}

	/*
	 * GETTRER AND SETTER FUNCTIONS
	 */
	public void setname(String Name)
	{
		this.name=Name;
	}
	public void setdatumid(int Datumid)
	{
		this.datumId=Datumid;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
	public void setpropertyid(int Propertyid)
	{
		this.propertyid=Propertyid;
	}
	public void setvalue(String Value)
	{
		this.value=Value;
	}
	public void setdatetime(java.sql.Date Date)
	{
		this.datetime=Date;
	}
	public int getdatumid()
	{
		return datumId;
	}
	public  String getusername()
	{
		return username;
	}
	public int getpropertyid()
	{
		return propertyid;
	}
	public String getvalue()
	{
		return value;
	}
	public java.sql.Date getdate()
	{
		return datetime;
	}
	
	public String getname()
	{
		return name;
	}
	
	public static String healthdescription()
	{
		
		System.out.println("Enter the description");
		String description=in.nextLine();
		return description;
	}
	public static void update_health(Health health)
	{
		HealthDAO.view_healthdata();
		
		System.out.println("Enter the ID of which you want to update value: ");
		//HealthDAO.health_update(health,in.nextInt());
		
	}
	
}
