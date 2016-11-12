package bean;
import java.util.ArrayList;


import dataObject.ForumDAO;

/*
 * CLASS : DISCUSSION
 * DESCRIPTION : MODEL CLASS FOR DISCUSSION FORUM
 */
public class Discussion {

	//DATA MEMBER FOR DISCUSSION
	private ArrayList<Forum>forums;
/*
 * FUNCTIONS FOR CLASS DISCUSSION	
 */
	public Discussion()
	{
		forums = new ArrayList<Forum>();
	}
	
	/*
	 * FUNCTION NAME : CreateForum
	 * Return : void
	 * Description : creates a forum
	 */
	public void CreateForum(User user)
	{
		if(user.getUsertypeid() != 4)
		{
			System.out.println("Sorry !! The forum cannot be created by anyone except moderator");
			return;
		}
		
		Forum forum = new Forum();
		forum.getForumdata(user);
		forums.add(forum);
		System.out.println("Forum created");
		
	}
	
	public void Createforum(String username,String topic,String summary,String URL)
	{
		System.out.print("Inside createForum");
		Forum forum = new Forum(username,topic,summary,URL);
		ForumDAO.addForum(forum);
		forums.add(forum);
	}
	
	public Forum getPostUsingForumID(int id)
	{
		for(int i = 0; i < forums.size(); i++)
		{
			if(id == forums.get(i).getForumId())
				return forums.get(i);
			
		}
		
		return null;
		
	}
	
	public void printForum()
	{
		
		for(int i = 0; i < forums.size(); i++)
			forums.get(i).printForumDetails();
	}
	
	//get all forums
	public ArrayList<Forum> getAllForums()
	{
		return ForumDAO.getAllForum();
	}
	
	public void fillDiscussion()
	{
		forums = getAllForums();
	}
	
	/*
	 * FUNCTION : getForumbyID
	 * RETURN TYPE : Forum
	 * DESCRIPTION : Return Forum based on froum ID
	 */
	public Forum getForumbyID(int id)
	{
		for(int i =0;i < forums.size();i++)
		{
			if(id == forums.get(i).getForumId())
				return forums.get(i);
			
			
		}
		
		return null;
	}


}

