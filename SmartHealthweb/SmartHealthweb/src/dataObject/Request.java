package dataObject;


import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

import bean.User;




public class Request {

	private java.sql.Date date;
	private String requested ;
	ArrayList<String> friends=new ArrayList<String>();
	
	public Boolean request_search1(String user)
	{
		DAOUtil data_object = new DAOUtil();
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			String s= "select * from `smarthealthdb`.`User` where Username= '"+user+"' AND Status=1 AND UserTypeID=1 OR UserTypeID=2 OR UserTypeID=3;";
			ResultSet rs = stat.executeQuery(s);
			if(rs.next())
			{
				requested=rs.getString(1);
				return true;
			}
			data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return false;
	}
	public int request_sent(User user)
	{
		DAOUtil data_object = new DAOUtil();
		Connection con = data_object.getConnection();
		try
		{
		//	System.out.println(requester+" "+requested);
			java.sql.Statement stat = con.createStatement();
			date = new java.sql.Date((new Date()).getTime());
			String  s= "Select * from `smarthealthdb`.`Friendship` where Requester_Username='"+user.getUsername()+"' AND Requested_Username='"+requested+"';";
			ResultSet  rs = stat.executeQuery(s);
			while(rs.next())
			{
				if(rs.getString(6)!=null)
				{
					System.out.println("You are already friends");
					return 1;
				}
				if(rs.getString(5)!=null)
				{
					s= "update `smarthealthdb`.`Friendship` set WhenRejected=null where Requester_Username='"+user.getUsername()+"' AND Requested_Username='"+requested+"';";
					  stat.executeUpdate(s);
					return 1;
				}
				if(rs.getString(4)==null)
				{
					System.out.println("Friend request is already sent");
					return 1;
				}
				if(rs.getString(4)!=null)
				{
					s= "update `smarthealthdb`.`Friendship` set WhenWithdrawn=null,WhenRequested=NOW() where Requester_Username='"+user.getUsername()+"' AND Requested_Username='"+requested+"';";
					  stat.executeUpdate(s);
					  return 1;
				}
				
				if(rs.getString(7)!=null)
				{
					s= "update `smarthealthdb`.`Friendship` set WhenUnfriended=null,WhenRequested=NOW() where Requester_Username='"+user.getUsername()+"' AND Requested_Username='"+requested+"';";
					  stat.executeUpdate(s);
					return 1;
				}
				
				
				
					
			}
			 s= "Select * from `smarthealthdb`.`Friendship` where Requester_Username='"+requested+"' AND Requested_Username='"+user.getUsername()+"';";
			 rs = stat.executeQuery(s);
			while(rs.next())
			{
				
				if(rs.getString(4)!=null)
				{
					s= "update `smarthealthdb`.`Friendship` set WhenWithdrawn=null,WhenRequested=NOW() where Requester_Username='"+requested+"' AND Requested_Username='"+user.getUsername()+"';";
					  stat.executeUpdate(s);
					  return 1;
				}
				if(rs.getString(6)!=null)
				{
					System.out.println("You are already friends");
					return 1;
				}
				
				if(rs.getString(4)==null)
				{
					System.out.println("The user has already sent you the request ...go to the received request to confirm");
					return 1;
				}
				
				
					
			}
			//String s= "insert into `smarthealthdb`.`Friendship`(Requester_Username,Requested_Username,WhenRequested) values('" +requester+"','"+requested+"',NOW())";
			s= "insert into `smarthealthdb`.`Friendship`(Requester_Username,Requested_Username,WhenRequested) values('" +user.getUsername()+"','"+requested+"',NOW())";
			
			stat.executeUpdate(s);
			data_object.closeConnection(con);	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	public int request_view_sent(User user)
	{
		DAOUtil data_object = new DAOUtil();
		int flag=0;
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			date = new java.sql.Date((new Date()).getTime());
			
			
			String s= "Select * from `smarthealthdb`.`Friendship` where Requester_Username='"+user.getUsername()+"' AND WhenWithdrawn IS NULL AND WhenRejected IS NULL AND WhenConfirmed IS NULL;";
			ResultSet rs = stat.executeQuery(s);
			
			while(rs.next())
			{
				flag=1;
				System.out.println(rs.getString(2));
			}
			data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return flag;
	}
	
	public ArrayList<String> allUsers(String user)
	{
		DAOUtil data_object = new DAOUtil();
		Connection con = data_object.getConnection();
		ArrayList<String> alluser = new ArrayList<String>();
		try{
			java.sql.Statement stat = con.createStatement();
			String s= "Select * from `smarthealthdb`.`User` where Username!='"+user+"' AND  UserTypeID=1 OR UserTypeID=2 OR UserTypeID=3 ";
			ResultSet rs = stat.executeQuery(s);
			
			while(rs.next())
			{
				alluser.add(rs.getString(2));
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return alluser;
	}
	
	public ArrayList<String> friends_view(String user)
	{
		DAOUtil data_object = new DAOUtil();
		int flag=0;
		
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			date = new java.sql.Date((new Date()).getTime());
			
			
			String s= "Select * from `smarthealthdb`.`Friendship` where Requester_Username='"+user+"'  AND WhenConfirmed IS NOT NULL ;";
			ResultSet rs = stat.executeQuery(s);
			
			while(rs.next())
			{
				flag=1;
				System.out.println(rs.getString(2));
				friends.add(rs.getString(2));
				
			}
			s= "Select * from `smarthealthdb`.`Friendship` where   Requested_Username='"+user+"' AND WhenConfirmed IS NOT NULL;";
			 rs = stat.executeQuery(s);
			
			while(rs.next())
			{
				flag=1;
				System.out.println(rs.getString(1));
				friends.add(rs.getString(1));
			}
			data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(flag==0)
		{
			System.out.println("Friends list is empty");
		}
		return friends;
	}
	
	public void friends_remove(User user,String remove)
	{
		DAOUtil data_object = new DAOUtil();
		
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			date = new java.sql.Date((new Date()).getTime());
			
			
			String s= "update `smarthealthdb`.`Friendship` SET WhenUnfriended=NOW(),WhenConfirmed=null,WhenRequested=null where Requester_Username='"+user.getUsername()+"' AND Requested_Username='"+remove+"'AND WhenConfirmed IS NOT NULL ;";
			stat.executeUpdate(s);
			
			 s= "update `smarthealthdb`.`Friendship` SET WhenUnfriended=NOW(),WhenConfirmed=null,WhenRequested=null where Requester_Username='"+remove+"' AND Requested_Username='"+user.getUsername()+"'AND WhenConfirmed IS NOT NULL ;";
			  stat.executeUpdate(s);
			
			  data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void request_withdraw(User user,String withdraw)
	{
		DAOUtil data_object = new DAOUtil();
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			date = new java.sql.Date((new Date()).getTime());
			String s= "update `smarthealthdb`.`Friendship` SET WhenWithdrawn='"+date+"',WhenRequested=null where Requester_Username='"+user.getUsername()+"' AND Requested_Username='"+withdraw+"'AND WhenWithdrawn IS NULL AND WhenRejected IS NULL AND WhenConfirmed IS NULL;";
			stat.executeUpdate(s);
			data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public void request_rejected(String requester,String rejected)
	{
		DAOUtil data_object = new DAOUtil();
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			date = new java.sql.Date((new Date()).getTime());
			String s= "update `smarthealthdb`.`Friendship` SET WhenRejected='"+date+"',WhenRequested=null where Requester_Username='"+rejected+"' AND Requested_Username='"+requester+"';";
			 stat.executeUpdate(s);
			 data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void request_confirmed(User user,String accepted)
	{
		DAOUtil data_object = new DAOUtil();
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			date = new java.sql.Date((new Date()).getTime());
			String s= "update `smarthealthdb`.`Friendship` SET WhenConfirmed='"+date+"',WhenRequested=null where Requester_Username='"+accepted+"' AND Requested_Username='"+user.getUsername()+"';";
			stat.executeUpdate(s);
			data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void request_unfriend(User user,String requester)
	{
		DAOUtil data_object = new DAOUtil();
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			date = new java.sql.Date((new Date()).getTime());
			System.out.println(requester);
		//	System.out.println(User.getUsername());
			String s= "update `smarthealthdb`.`Friendship` SET WhenUnfriended='"+date+"',WhenConfirmed=null,WhenRequested=null where Requester_Username='"+requester+"' AND Requested_Username='"+user.getUsername()+"';";
			stat.executeUpdate(s);
			s= "update `smarthealthdb`.`Friendship` SET WhenUnfriended='"+date+"',WhenConfirmed=null,WhenRequested=null where Requester_Username='"+user.getUsername()+"' AND Requested_Username='"+requester+"';";
			stat.executeUpdate(s);
			data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public ArrayList<String> request_view(String user)
	{
		DAOUtil data_object = new DAOUtil();
		ArrayList<String>Friendrequest = new ArrayList<String>();
		Connection con = data_object.getConnection();
		try
		{
			
			java.sql.Statement stat = con.createStatement();
			date = new java.sql.Date((new Date()).getTime());
			String s= "Select * from `smarthealthdb`.`Friendship` where Requested_Username='"+user+"' AND WhenWithdrawn IS NULL AND WhenRejected IS NULL AND WhenConfirmed IS NULL;";
			ResultSet rs = stat.executeQuery(s);
			while(rs.next())
			{
				Friendrequest.add(rs.getString(1));
				System.out.println(rs.getString(1));
			}
			data_object.closeConnection(con);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return Friendrequest;
	
	}
	public void delete_entry(String user)
	{
		DAOUtil data_object = new DAOUtil();
		
		Connection con = data_object.getConnection();
		try
		{
			java.sql.Statement stat = con.createStatement();
			date = new java.sql.Date((new Date()).getTime());
			String s= "Delete `smarthealthdb`.`Friendship` where Requested_Username='"+user+"' or Requester_Username='"+user+"' ;";
			 stat.executeUpdate(s);
			data_object.closeConnection(con);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
