package dataObject;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Admin;


/*
 * CLASS AdminDAO
 * Description : class handling database for admin
 */

public class AdminDAO {
	
	/*
	 * function : addAdmin
	 * Description : add admin user
	 */
	public static void addAdmin(Admin admin)
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();

		try{
			PreparedStatement ps ;
			ps = connection.prepareStatement("insert into `smarthealthdb`.`Administrator` values(?,?)");
			ps.setString(1, admin.getUsername());
			ps.setString(2, admin.getContact());
			
			ps.executeUpdate();


			ps = connection.prepareStatement("insert into User values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, admin.getUsername());
			ps.setString(2, admin.getPassword());
			ps.setString(3, admin.getPrimary_email());
			ps.setString(4, admin.getSecondary_email());
			ps.setString(5, admin.getFirst_name());
			ps.setString(6, admin.getLast_name());
			ps.setString(7, admin.getAbout_me());
			ps.setString(8, admin.getURL1());
			ps.setString(9, admin.getURL2());
			ps.setString(10, admin.getURL3());
			ps.setString(11, admin.getPostal_address());
			ps.setString(12, admin.getPostal_address());
			ps.setString(13, admin.getPostal_address());
			ps.setString(14, admin.getPostal_address());
			ps.setString(15, admin.getPostal_address());
			ps.setInt(16, 5);
			ps.setInt(17, admin.getIs_active());
			ps.executeUpdate();
			System.out.println("Personal Details of Admin has been submitted");
			data_object.closeConnection(connection);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
	
	/*
	 * Function : updateAdmin
	 * Description : update admin detail
	 * 
	 */
	public static void updateAdmin(Admin admin)
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		
		try
		{
			System.out.println("hi");
			PreparedStatement ps = connection.prepareStatement("update  `smarthealthdb`.`Administrator` set Phone=? where Username=?");
			ps.setString(1, admin.getContact());
			ps.setString(2, admin.getUsername());
			ps.executeUpdate();
		
			ps=connection.prepareStatement("update `smarthealthdb`.`User` set Password=?,Email1=?,Email2=?, FirstName=?, LastName=?, AboutMe=?, PhotoURL1=?, PhotoURL2=?,PhotoURL3=?, StreetNumber=?,StreetName=?, MajorMunicipality=?, GoverningDistrict=?,PostalArea=?,Status=? where Username=?");
			
		
		    ps.setString(1, admin.getPassword());
		    ps.setString(2, admin.getPrimary_email());
		    ps.setString(3, admin.getSecondary_email());
		    ps.setString(4, admin.getFirst_name());
		    ps.setString(5, admin.getLast_name());
		    ps.setString(6, admin.getAbout_me());
		    ps.setString(7, admin.getURL1());
		    ps.setString(8, admin.getURL2());
		    ps.setString(9, admin.getURL3());
		    ps.setString(10, admin.getPostal_address());
		    ps.setString(11, admin.getPostal_address());
		    ps.setString(12, admin.getPostal_address());
		    ps.setString(13, admin.getPostal_address());
		    ps.setString(14, admin.getPostal_address());
		    ps.setInt(15,admin.getIs_active());
		    ps.setString(16,admin.getUsername());
		    
		  
		  
		    
		    if(ps.executeUpdate()==0)
		    	System.out.println("Admin details not updated ");
			else
			{
				System.out.println("Admin details updates successfully");
				data_object.closeConnection(connection);
			}	
		   
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	}
	

}
