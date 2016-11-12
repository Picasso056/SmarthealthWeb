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
 * Servlet implementation class addfriendservlet
 */
@WebServlet("/addfriendservlet")
public class addfriendservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addfriendservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		session.getAttribute("type");
	       response.setContentType("text/html");
	        System.out.println("hello add friend");
	        
	 
			     
			        ArrayList<String> friends = (ArrayList<String>)session.getAttribute("allusers");
			        System.out.println(friends);
			        for(String user1 : friends){
			        	System.out.println(user1);
			        	
			        	String accept=request.getParameter("addfriend["+user1+"]");
				     
				       
				        if(accept!=null){
				        	Request request1=new Request();
				        	request1.request_search1(user1);
				        	if(request1.request_sent(user)==0)
							{
								out.println("<script type=\"text/javascript\">");
					        	   out.println("alert('request sent');");
					        	   out.println("location='AddFriend.jsp';");
					        	   out.println("</script>");
					        	   
					        	  
							}
			        	}
				      
				       
			            
			        }
			        request.getRequestDispatcher("/AddFriend.jsp").forward(request, response);	
		        
	        
	}

}
