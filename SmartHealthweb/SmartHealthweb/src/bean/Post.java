package bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import dataObject.PostDAO;

/*CLASS : POST
 * DESCRIPTION : MODEL CLASS FOR POST USED IN DISCUSSION
 * 
 */
public class Post {

	/*
	 * DATA MEMBEER
	 */
	private  String Username;
	private  Timestamp TimeCreated;
	private int ForumId;
	private String Text;
	private String PhotoLocation;
	private String LinkLocatin;
	private String VideoLocation;
	private static ArrayList<Comment>comments = new ArrayList<Comment>();
	
	
	
	/*
	 * constructor and member unctions
	 */
	public Post()
	{
		
	}
	
	public Post(String user,int id,String text,String photo,String Link,String Video)
	{
		
		this.Username = user;
		this.Text = text;
		this.PhotoLocation = photo;
		this.LinkLocatin = Link;
		this.VideoLocation = Video;
	}
	
	public Post(String user,int id,String text,String photo,String Link,String Video,Timestamp date)
	{
		
		this.Username = user;
		this.ForumId = id;
		this.Text = text;
		this.PhotoLocation = photo;
		this.LinkLocatin = Link;
		this.VideoLocation = Video;
		this.TimeCreated = date;

	}
	
	
	public String getUsername() {
		return Username;
	}
	public  void setUsername(String username) {
		this.Username = username;
	}
	public Timestamp getTimeCreated() {
		return TimeCreated;
	}
	public  void setTimeCreated(Timestamp timeCreated) {
		this.TimeCreated = timeCreated;
	}
	public int getForumId() {
		return ForumId;
	}
	public void setForumId(int forumId) {
		ForumId = forumId;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	public String getPhotoLocation() {
		return PhotoLocation;
	}
	public void setPhotoLocation(String photoLocation) {
		PhotoLocation = photoLocation;
	}
	public String getLinkLocatin() {
		return LinkLocatin;
	}
	public void setLinkLocatin(String linkLocatin) {
		LinkLocatin = linkLocatin;
	}
	public String getVideoLocation() {
		return VideoLocation;
	}
	public void setVideoLocation(String videoLocation) {
		VideoLocation = videoLocation;
	}
	
	public void Postdata(User user,int forumid)
	{
		//in.next();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the data in the post");
		Username = user.getUsername();
		TimeCreated = new Timestamp((new Date()).getTime());
		ForumId = forumid;
		
		System.out.println("Enter the text");
		Text = in.nextLine();
		System.out.println("Enter the photo location");
		PhotoLocation = in.nextLine();
		System.out.println("Enter the video location ");
		VideoLocation = in.nextLine();
		System.out.println("Enter the link location");
		LinkLocatin = in.nextLine();
		PostDAO.addPost(this);
		System.out.println("Hello");
	}
	
	/*public void printComment()
	{
		for(int i = 0 ; i < comments.size();i++)
			comments.get(i).printComment();
	}
	
	public void printPostData()
	{
		System.out.println("Data in the post");
		System.out.println("Forum Id :" + ForumId );
		System.out.println("Username :"+ Username);
		System.out.println("Time Created :" + TimeCreated);
		System.out.println("Text :"+ Text);
		System.out.println("Photo location :" + PhotoLocation);
		System.out.println("Video location :"+ VideoLocation);
		System.out.println("Link location :"+ LinkLocatin);
				
	}*/
	
/*	public static void getComment(User user,Post post)
	{
		Comment comment = new Comment();
		comment.getComment(user,post);
		comments.add(comment);
		
	}
	*/
	
}
