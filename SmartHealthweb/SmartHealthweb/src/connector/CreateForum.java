package connector;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Discussion;
import bean.Person;
import bean.User;

/**
 * Servlet implementation class CreateForum
 */
@WebServlet("/CreateForum")
public class CreateForum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateForum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 
		HttpSession session=request.getSession();
		User user=  (User)session.getAttribute("user");
		  response.setContentType("text/html");
		  Discussion discussion = new Discussion();
		  
		  
		  
		  String title = request.getParameter("title");
		  String summary = request.getParameter("summary");
		  String link = request.getParameter("link");
		  System.out.println(title);
		  
		  if(title == null)
		  {
			  System.out.println("id :" + user.getUsertypeid());
			/*  out.println("<script type=\"text/javascript\">");
       	   	out.println("alert('Enter valid forum name');");
       	   out.println("location='CreateForum.jsp';");
       	   out.println("</script>");*/
       	request.getRequestDispatcher("/CreateForum.jsp").forward(request, response);
		  }
	
		  
		 
		  
		  else if(user.getUsertypeid() != 4)
		  {
			  System.out.println("id :" + user.getUsertypeid());
			  System.out.println("Moderator can create forum ");
			  
	      // 	   request.setAttribute("k", arg1);
	       //	request.getRequestDispatcher("/CreateForum.jsp").forward(request, response);
			  response.sendRedirect("CreateForum.jsp");
		  }
		  
		  else
		  {
			  if(discussion == null)
			  {
				  discussion = new Discussion();
				  discussion.Createforum(user.getUsername(), title, summary, link);
				  request.getRequestDispatcher("CreateForum.jsp").forward(request, response);
				}
			  
			  else
			  {
				  discussion.Createforum(user.getUsername(), title, summary, link);
				  request.getRequestDispatcher("CreateForum.jsp").forward(request, response);
					
			  }
			  
			  
		  }
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		System.out.println("Inside create");
		HttpSession session=request.getSession();
		User user=  (User)session.getAttribute("user");
		  response.setContentType("text/html");
		  Discussion discussion = (Discussion)session.getAttribute("discussion");
		  
		  String title = request.getParameter("title");
		  String summary = request.getParameter("summary");
		  String link = request.getParameter("link");
		  if(title.equals(null))
		  {
			  out.println("<script type=\"text/javascript\">");
       	   	out.println("alert('Enter valid forum name');");
       	   out.println("location='CreateForum.jsp';");
       	   out.println("</script>");
       	request.getRequestDispatcher("/CreateForum.jsp").forward(request, response);
		  }
		  
		  if(user.getUsertypeid() != 4)
		  {
			  out.println("<script type=\"text/javascript\">");
	       	   	out.println("alert('Only Moderator can create forums');");
	       	   out.println("location='CreateForum.jsp';");
	       	   out.println("</script>");
	       	request.getRequestDispatcher("/CreateForum.jsp").forward(request, response);
		  }
		  
		  else
		  {
			  if(discussion == null)
			  {
				  discussion = new Discussion();
				  discussion.Createforum(user.getUsername(), title, summary, link);
				  out.println("<script type=\"text/javascript\">");
		       	   out.println("alert('Forum Created');");
		       	   out.println("location='CreateForum.jsp';");
		       	   out.println("</script>");
			  }
			  
			  
		  }
	}

}
