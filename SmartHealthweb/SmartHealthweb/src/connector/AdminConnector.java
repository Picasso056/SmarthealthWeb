package connector;

import java.util.Scanner;

import dataObject.AdminDAO;
import bean.Admin;
import bean.Person;

public class AdminConnector extends EndUserConnector{
	static Scanner in=new Scanner(System.in);
	
	public static void update_profile()
	{

		

		
		
		AdminDAO.updateAdmin((Admin)smartHealth.get_user());
	}
	public void register()
	{
		super.register();
		while(true){
		System.out.print("Enter the contact number: ");
		String contact;
		contact = in.next();
		if((Long.parseLong(contact)<=9999999999.0)&&(Long.parseLong(contact)>=1000000000))	
		{
			Admin admin=new Admin();
			admin.setContact(contact);
			break;
		}
		}
		AdminDAO.addAdmin((Admin)smartHealth.get_user());
	}

}
