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

import dataObject.PostDAO;
import bean.Post;
import bean.User;

/**
 * Servlet implementation class addpost
 */
@WebServlet("/addpost")
public class addpost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addpost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		User user=  (User)session.getAttribute("user");
		
	
		
		  String username = user.getUsername();	
		  String text = request.getParameter("text");
		  String video = request.getParameter("videolocation");
		  String photo = request.getParameter("photolocation");
		  String link = request.getParameter("linklocation");
		  Timestamp date = new Timestamp((new Date()).getTime());
		  String id = (String)session.getAttribute("id");
		  System.out.println("Inside add "+ id);
		  int ids = Integer.parseInt(id);
		  
		 Post post = new Post(username,ids,text,photo,link,video,date);
				 
		 PostDAO.addPost(post);
		 RequestDispatcher rd = request.getRequestDispatcher("addpost.jsp");
			rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
