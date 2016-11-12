package dataObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import bean.Post;
import bean.Rating;
import bean.User;


/*
 * CLASS PosrnDAO
 * Description : class handling database for post
 */

public class PostDAO {

	/*
	 * Function : addPost
	 * Description : add post
	 */
	public static void addPost(Post post)
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		
		try{
			PreparedStatement ps ;
			ps = connection.prepareStatement("insert into `smarthealthdb`.`Post` values(?,?,?,?,?,?,?)");
					
			ps.setString(1, post.getUsername());
			ps.setTimestamp(2, new Timestamp((new Date()).getTime()));
			ps.setInt(3, post.getForumId());
			ps.setString(4, post.getText());
			ps.setString(5,post.getPhotoLocation());
			ps.setString(6,post.getLinkLocatin());
			ps.setString(7,post.getVideoLocation());
			
			System.out.println(post.getForumId());
			
			ps.executeUpdate();
			
			System.out.println("Post has been submitted");
			data_object.closeConnection(connection);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	/*
	 * Function : getPost
	 * Description : get Post of a user 
	 */
	public static ResultSet getpost(User user)
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		ResultSet rs;
		try{
			java.sql.Statement stat = connection.createStatement();
			String s= "select * from `smarthealthdb`.`Post`;";
			rs = stat.executeQuery(s);
			return rs;
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public static void ratingpost(User user,int id,int stars)
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		ResultSet rs;
		Rating rating =new Rating();
		try{
			java.sql.Statement stat = connection.createStatement();
			
			String s= "select * from `smarthealthdb`.`Post` where ForumID="+id+";";
			rs = stat.executeQuery(s);
			if(rs.next())
			{
				
				rating.setUsername(rs.getString(1));
			//	rating.setPostTimeCreated(rs.getDate(2));
				
			}
			rating.setRaterUsername(user.getUsername());
			rating.setStars(stars);
		
			s= "select * from `smarthealthdb`.`Rating` where Post_Username='"+rating.getUsername()+"' and Post_TimeCreated='"+rating.getPostTimeCreated()+"' and Rater_Username='"+rating.getRaterUsername()+"';";
			rs = stat.executeQuery(s);
			if(rs.next())
			{
				System.out.println("3");
				s= "update `smarthealthdb`.`Rating` set Stars="+stars+" where Post_Username='"+rating.getUsername()+"' and Post_TimeCreated='"+rating.getPostTimeCreated()+"' and Rater_Username='"+rating.getRaterUsername()+"';";
				stat.executeUpdate(s);
			}
			else
			{
			
				s= "insert into `smarthealthdb`.`Rating` values('"+rating.getUsername()+"','"+rating.getPostTimeCreated()+"','"+rating.getRaterUsername()+"',"+stars+");";
				stat.executeUpdate(s);
			}
			
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Description : get post by id
	 */
	public static ArrayList<Post> Dao_getPostbyID(int id)
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		ResultSet rs;
		ArrayList<Post>post = new ArrayList<Post>();
		
		try
		{
			java.sql.Statement stat = connection.createStatement();
			
			String s= "select * from `smarthealthdb`.`Post` where ForumID="+id+";";
			rs = stat.executeQuery(s);
			while(rs.next())
			{
				Post p = new Post(rs.getString(1),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getTimestamp(2));
				post.add(p);
				
			}
		}
			catch(Exception e){
				System.out.println(e.getMessage());
					
		}
		return post;
		
	} 
	/*
	 * Description : rate Post
	 */
	public static void RatePost(Rating rate) 
	{
		DAOUtil data_object = new DAOUtil();
		Connection connection = data_object.getConnection();
		
		try{
		PreparedStatement ps ;
		ps = connection.prepareStatement("insert into `smarthealthdb`.`Rating` values(?,?,?,?)");
				
		ps.setString(1, rate.getUsername());
		ps.setTimestamp(2,rate.getPostTimeCreated() );
		ps.setString(3, rate.getRaterUsername());
		ps.setInt(4, rate.getStars());
		
		ps.executeUpdate();
		
		System.out.println("Post has been submitted");
		data_object.closeConnection(connection);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
