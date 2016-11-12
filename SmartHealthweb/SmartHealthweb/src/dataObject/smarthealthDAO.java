
package dataObject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import connector.smartHealth;
import bean.Admin;
import bean.Health;
import bean.Moderator;
import bean.Person;
import bean.User;


public class smarthealthDAO {

	DAOUtil data_object = new DAOUtil();
	/*
	 * Description : login function
	 */
	public static int authenticatelogin(String email,String password)
	{
				
		try
		{
			ResultSet rs;
		
			DAOUtil connect=new DAOUtil();
			Connection con = connect.getConnection();
			java.sql.Statement stat = con.createStatement();

	 
			String s= "select * from `smarthealthdb`.`User` where Email1= '"+email+"'AND Password='"+password+"'AND Status=1; ";
    
			rs = stat.executeQuery(s);
			
	
			if(!rs.next())
			{
				s= "select * from `smarthealthdb`.`User` where Email1= '"+email+"'AND Status=1; ";
			    
				rs = stat.executeQuery(s);
				if(rs.next())
				{
					s= "insert into  `smarthealthdb`.`LoginAttempt`(Username,Password,UserAgentString) values('"+email+"','"+password+"','unsuccessfull')  ";
				    
					 stat.executeUpdate(s);
				}
				
				return 0;
			}
			else
			{
				int type=create_user(rs);
				s= "insert into  `smarthealthdb`.`LoginAttempt`(Username,Password,UserAgentString) values('"+email+"','"+password+"','successfull') ; ";
			    
				 stat.executeUpdate(s);
				 return type;
				
			} 
		
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
    
	return 1;
   
}
/*
 * Desccription : register user
 */
	public static int create_user(ResultSet rs)
	{
		
		int type;
		
		try {
			type = rs.getInt(16);
			User user=null;
			String s;
			DAOUtil connect=new DAOUtil();
			Connection con = connect.getConnection();
		      java.sql.Statement stat = con.createStatement();
		      if(type==4)
		      {
		    	   user=new Moderator();
		      }
		      else if(type==5)
		      {
		    	   user=new Admin();
		      }
		      else
		      {
		    	  user=new Person();
		      }
		      user.setUsertypeid(type);
		      System.out.println(type+"=hi");
			switch(type)
			{
			case 1:
			case 2:
			case 3:
				
				s= "select * from `smarthealthdb`.`User` NATURAL JOIN `smarthealthdb`.`EndUser` where Username= '"+rs.getString(1)+"'; ";
				rs = stat.executeQuery(s);
				rs.next();
				user=new Person(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getInt(16),rs.getInt(17),rs.getInt(18),rs.getDate(19));
				Health h=new Health(rs.getString(1));
				((Person)user).updateKarma();
				((Person)user).updateUsertype();
				EndUserDAO.updateEndUser((Person)user);
				break;
			case 4:
				
				s= "select * from `smarthealthdb`.`User` NATURAL JOIN `smarthealthdb`.`Moderator` where Username= '"+rs.getString(1)+"'; ";
				rs = stat.executeQuery(s);
				rs.next();
				user=new Moderator(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getInt(16),rs.getInt(17),rs.getString(18));
				
				break;
			case 5:
				
				s= "select * from `smarthealthdb`.`User` NATURAL JOIN `smarthealthdb`.`Administrator` where Username= '"+rs.getString(1)+"'; ";
				rs = stat.executeQuery(s);
				rs.next();
				user=new Admin(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getInt(16),rs.getInt(16),rs.getString(18));
				break;
				
			}
			
			smartHealth.set_user(user);
			
			
			return type;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
	}
	/*
	 * Description : check uniqueness of mail
	 */
	public static Boolean uniqueness_email(String user)
	{
		DAOUtil data_object = new DAOUtil();
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			String s= "select * from `smarthealthdb`.`User` where Email1= '"+user+"' ";
			ResultSet rs = stat.executeQuery(s);
			if(rs.next())
			{
				return false;
			}
			data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			
		}
		return true;
	}
	/*
	 * Description : check uniqueness of username
	 */
	
	public static Boolean uniqueness_username(String user)
	{
		DAOUtil data_object = new DAOUtil();
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			String s= "select * from `smarthealthdb`.`User` where Username= '"+user+"' ";
			ResultSet rs = stat.executeQuery(s);
			if(rs.next())
			{
				return false;
			}
			data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			
		}
		return true;
	}
}