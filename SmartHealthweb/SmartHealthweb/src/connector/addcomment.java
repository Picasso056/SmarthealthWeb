package connector;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dataObject.CommentDAO;
import bean.Comment;
import bean.User;

/**
 * Servlet implementation class addcomment
 */
@WebServlet("/addcomment")
public class addcomment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addcomment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Entering");
		HttpSession session=request.getSession();
		User user=  (User)session.getAttribute("user");
		String postusername = (String)session.getAttribute("postuser");
		Timestamp postDate = (Timestamp)session.getAttribute("postdate");
	
			System.out.println("INSIDE ADD COMMENT DATE:"+ postDate);
		  String username = user.getUsername();	
		  String text = request.getParameter("text");
		  String video = request.getParameter("videolocation");
		  String photo = request.getParameter("photolocation");
		  String link = request.getParameter("linklocation");
		  Timestamp date = new Timestamp((new Date()).getTime());
		  
		  Comment comment = new Comment(postusername,postDate,username,date,text,photo,link,video);
		  
		  
		  CommentDAO.addComment(comment);
		  
		  RequestDispatcher rd = null;
		  
		  if(user.getUsertypeid() == 4)
			  rd = request.getRequestDispatcher("homepagemoderator.jsp");
		  
		  else if(user.getUsertypeid() == 5)
			  rd = request.getRequestDispatcher("homepageadmin.jsp");
		  
		  else
			  rd = request.getRequestDispatcher("homepage.jsp");
		
		  rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
