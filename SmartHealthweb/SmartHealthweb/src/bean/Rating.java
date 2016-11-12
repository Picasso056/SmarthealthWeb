package bean;

import java.sql.Timestamp;
/*
 * CLASS : RATING
 * DESCRIPTION : RATING USED TO RATE POST
 */

public class Rating {

	/*
	 * DATA MEMBER FOR CLASS RATING
	 */
	
	private String Username;
	private Timestamp PostTimeCreated;
	private  String RaterUsername;
	private  int stars;
	
	/*
	 * CONSTRUCTOR
	 */
	public Rating()
	{
		
	}
	public Rating(String username, Timestamp postTimeCreated, String raterUsername,
			int stars) {
		super();
		Username = username;
		PostTimeCreated = postTimeCreated;
		RaterUsername = raterUsername;
		this.stars = stars;
	}

	/*
	 * GETTER AND SETTER 
	 */
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		this.Username = username;
	}
	public  Timestamp getPostTimeCreated() {
		return PostTimeCreated;
	}
	public void setPostTimeCreated(Timestamp postTimeCreated) {
		this.PostTimeCreated = postTimeCreated;
	}
	public String getRaterUsername() {
		return RaterUsername;
	}
	public void setRaterUsername(String raterUsername) {
		this.RaterUsername = raterUsername;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int Stars) {
		this.stars = Stars;
	}
	
	public void getratingdata()
	{
		//TODO
		
	}
	
	
}
