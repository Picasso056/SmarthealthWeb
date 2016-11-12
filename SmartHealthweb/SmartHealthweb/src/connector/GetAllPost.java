package connector;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Discussion;
import bean.Forum;
import bean.Post;

/**
 * Servlet implementation class GetAllPost
 */
@WebServlet("/GetAllPost")
public class GetAllPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id ;
		
		response.setContentType("text/html");
		String ids = request.getParameter("id");
		
		HttpSession session = request.getSession();
		session.setAttribute("id", ids);
		id = Integer.parseInt(ids);
		
		System.out.println("Inside GetAllPost id:"+ id);
		//s.setAttribute("id", ids);
		
		
		ArrayList<Post>post = Forum.getPostbyForumID(id);
		
		//System.out.println("Post date"+ post.get(0).getTimeCreated());
		
		System.out.println("hello how ");
		request.setAttribute("allPost", post);
		RequestDispatcher rd = request.getRequestDispatcher("allpost.jsp");
		rd.forward(request, response);
	
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
