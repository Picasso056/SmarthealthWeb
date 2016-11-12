package connector;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Person;
import bean.User;
import dataObject.Request;

/**
 * Servlet implementation class unfriendservlet
 */
@WebServlet("/unfriendservlet")
public class unfriendservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public unfriendservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		session.getAttribute("type");
		Person user=(Person)session.getAttribute("user");
	       response.setContentType("text/html");
	        System.out.println("hello");
	     
	    
		     
		        ArrayList<String> friends = (ArrayList<String>)session.getAttribute("myfriends");
		        System.out.println(friends);
		        for(String user1 : friends){
		        	System.out.println(user1);
		        	
		        	String accept=request.getParameter("unfriend["+user1+"]");
			     
			       
			        if(accept!=null){
		        	
			        	Request request1=new Request();
			        	
			        	request1.request_unfriend(user,user1);
						
			        	out.println("<script type=\"text/javascript\">");
			        	   out.println("alert('unfriended');");
			        	   out.println("location='homepage.jsp';");
			        	   out.println("</script>");
		        	}
			      
			       
		            
		        }
		        request.getRequestDispatcher("/homepage.jsp").forward(request, response);	
	        
	        
	        
	        
	        
	       
	     
	        
	}

}
