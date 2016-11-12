package connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Date;

import dataObject.DAOUtil;
import bean.User;

public class qualifications {

	private java.sql.Date date;
	DAOUtil data_object = new DAOUtil();
	public void enter_qualification(String code,String user)
	{
		
		DAOUtil data_object = new DAOUtil();
		Connection con = data_object.getConnection();
		try
		{
			int count;
			date = new java.sql.Date((new Date()).getTime());
			java.sql.Statement stat = con.createStatement();
			String s= "select * from `smarthealthdb`.`Qualification` where Description= '"+code+"'";
			ResultSet rs = stat.executeQuery(s);
			System.out.println("qualification");
			if(!rs.next())
			{
				count=1;
				 s= "select * from `smarthealthdb`.`Qualification` ";
				rs = stat.executeQuery(s);
				while(rs.next())
				{
					count++;
				}
				
				 s= "insert into `smarthealthdb`.`Qualification` values("+count+",'"+code+"')";
				  stat.executeUpdate(s);
			}
			else
			{
				count=rs.getInt(1);
			}
			s= "select * from `smarthealthdb`.`ModeratorQualification` where QualificationID="+count+" AND Username='"+user+"'";
			rs = stat.executeQuery(s);
			if(!rs.next())
			{
				 s= "insert into `smarthealthdb`.`ModeratorQualification` values("+count+",'"+user+"','"+date+"')";
				  stat.executeUpdate(s);
			}
			else
			{
				System.out.println("You have already entered this qualification");
			}
			data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	
		
	}
	
}
