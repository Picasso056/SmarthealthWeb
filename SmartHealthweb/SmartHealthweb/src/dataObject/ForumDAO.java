package dataObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import bean.Forum;



/*
 * CLASS ForumDAO
 * Description : class handling database for Forum
 */


public class ForumDAO {

	/*
	 * Function : add Forum
	 * Description : add Forum
	 */
	public static void addForum(Forum forum)
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		
		try{
			PreparedStatement ps ;
			ps = connection.prepareStatement("insert into `smarthealthdb`.`Forum` values(?,?,?,?,?,?,?,?)");
					
			ps.setInt(1, forum.getForumId());
			ps.setString(2, forum.getTopic());
			ps.setString(3, forum.getURL());
			ps.setString(4, forum.getSummary());
			ps.setTimestamp(6,new Timestamp((new Date()).getTime()));
			ps.setString(7, forum.getCreatedby());
			ps.setString(8, forum.getClosedby());
			ps.executeUpdate();
			
			System.out.println("Forum has been submitted");
			data_object.closeConnection(connection);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	/*
	 * Function : showForum
	 * Description : show all forum
	 */
	public static void showForum()
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		try
		{
			java.sql.Statement stat = connection.createStatement();
			String s= "select * from `smarthealthdb`.`Forum` ;";
			ResultSet rs = stat.executeQuery(s);
			while(rs.next())
			{
				System.out.println("Forum ID: "+rs.getString(1)+"   Topic: "+rs.getString(2));
			}
			data_object.closeConnection(connection);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	}
	/*
	 * Function : noOfForum
	 * Description : get number of forum
	 */
	public static int noOfForum()
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		int count=1;
		try
		{
			java.sql.Statement stat = connection.createStatement();
			String s= "select * from `smarthealthdb`.`Forum` ;";
			ResultSet rs = stat.executeQuery(s);
			while(rs.next())
			{
				count++;
			}
			data_object.closeConnection(connection);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return count;
	}
	/*
	 * Function : getAllForum
	 * Description : get all Forum 
	 */
	public static ArrayList<Forum> getAllForum()
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		ArrayList<Forum>forum = new ArrayList<Forum>();
		
		try
		{
			java.sql.Statement stat = connection.createStatement();
			String s= "select * from `smarthealthdb`.`Forum` ;";
			
			ResultSet rs = stat.executeQuery(s);
			
			while(rs.next())
			{
				Forum f = new Forum(rs.getInt(1),rs.getString(2),rs.getString(4),rs.getString(3),rs.getString(7));
				forum.add(f);
			}
				
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
		return forum;
	}
	
}
