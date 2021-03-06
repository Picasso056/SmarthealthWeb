package dataObject;


import java.sql.Connection;
import java.sql.PreparedStatement;


import bean.Moderator;



/*
 * CLASS ModeratorDAO
 * Description : class handling database for moderator
 */

public class ModeratorDAO {
	
/*
 * Function : addModerator
 * Description : add moderator
 */
	public static void addModerator(Moderator person)
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		
		try{
			PreparedStatement ps ;
			ps = connection.prepareStatement("insert into `smarthealthdb`.`Moderator` values(?,?)");
			ps.setString(1, person.getUsername());
			ps.setString(2, person.getContact());
			
			ps.executeUpdate();


			ps = connection.prepareStatement("insert into User values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, person.getUsername());
			ps.setString(2, person.getPassword());
			ps.setString(3, person.getPrimary_email());
			ps.setString(4, person.getSecondary_email());
			ps.setString(5, person.getFirst_name());
			ps.setString(6, person.getLast_name());
			ps.setString(7, person.getAbout_me());
			ps.setString(8, person.getURL1());
			ps.setString(9, person.getURL2());
			ps.setString(10, person.getURL3());
			ps.setString(11, person.getPostal_address());
			ps.setString(12, person.getPostal_address());
			ps.setString(13, person.getPostal_address());
			ps.setString(14, person.getPostal_address());
			ps.setString(15, person.getPostal_address());
			ps.setInt(16, 4);
			ps.setInt(17, person.getIs_active());
			ps.executeUpdate();
			System.out.println("Personal Details of Moderator has been submitted");
			data_object.closeConnection(connection);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
	/*
	 * Function : iupdateModerator
	 * Description : update moderator
	 */
	public static void updateModerator(Moderator person)
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		try
		{
			PreparedStatement ps ;
			
		
			ps=connection.prepareStatement("update `smarthealthdb`.`User` set Password=?,Email1=?,Email2=?, FirstName=?, LastName=?, AboutMe=?, PhotoURL1=?, PhotoURL2=?,PhotoURL3=?, StreetNumber=?,StreetName=?, MajorMunicipality=?, GoverningDistrict=?,PostalArea=?,Status=? where Username=?");
			
		
		    ps.setString(1, person.getPassword());
		    ps.setString(2, person.getPrimary_email());
		    ps.setString(3, person.getSecondary_email());
		    ps.setString(4, person.getFirst_name());
		    ps.setString(5, person.getLast_name());
		    ps.setString(6, person.getAbout_me());
		    ps.setString(7, person.getURL1());
		    ps.setString(8, person.getURL2());
		    ps.setString(9, person.getURL3());
		    ps.setString(10, person.getPostal_address());
		    ps.setString(11, person.getPostal_address());
		    ps.setString(12, person.getPostal_address());
		    ps.setString(13, person.getPostal_address());
		    ps.setString(14, person.getPostal_address());
		    ps.setInt(15, person.getIs_active());
		    ps.setString(16,person.getUsername());
		
		  
		    
		    if(ps.executeUpdate()==0)
		    	System.out.println("Moderator details not updated ");
			else
			{
				System.out.println("Moderator details updates successfully");
				data_object.closeConnection(connection);
			}	
		   
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	}
	public static void show_qualification(String user)
	{
		/*try
		{
			
			String qual="";
			DAOUtil data_object = new DAOUtil();
			Connection con = data_object.getConnection();
			java.sql.Statement stat = con.createStatement();
			String s= "select q.Description from `smarthealthdb`.`ModeratorQualification` m NATURAL JOIN `smarthealthdb`.`Qualification` q where m.Username= '"+user+"' ;";
			ResultSet rs = stat.executeQuery(s);
			System.out.println("entered");
			while(rs.next())
			{
				
				System.out.println(rs.getString(1));
				qual=qual+rs.getString(1);
				qual=qual+",";
				
			}
			Moderator.setQualification(qual);
			
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}*/
	}
	

	
	
}
