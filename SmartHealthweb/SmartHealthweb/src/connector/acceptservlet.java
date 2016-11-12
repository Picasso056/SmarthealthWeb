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
 * Servlet implementation class acceptservlet
 */
@WebServlet("/acceptservlet")
public class acceptservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public acceptservlet() {
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
	       response.setContentType("text/html");
	        System.out.println("hello");
	        int type=(int) session.getAttribute("type");
	        User user=(User) session.getAttribute("user");
	        String friend=request.getParameter("Text1");
	        ArrayList<String> friends = (ArrayList<String>)session.getAttribute("request");
	        System.out.println(friends);
	        for(String user1 : friends){
	        	System.out.println(user1);
	        	
	        	String accept=request.getParameter("accept["+user1+"]");
		        String reject=request.getParameter("reject["+user1+"]");
		        Request request1=new Request();
		        if(accept!=null||reject!=null){
	        	if(accept.equals("submit")){
	        	request1.request_confirmed(user,user1);
				
				System.out.println("Request Confirmed");
				request.getRequestDispatcher("/homepage.jsp").forward(request, response);	
	        	}
	        	else if(reject.equals("reject"))
	        	{
	        		request1.request_rejected(user.getUsername(), friend);
					System.out.println("Request Rejected");
					request.getRequestDispatcher("/homepage.jsp").forward(request, response);	
	        	}}
		        System.out.println(accept);
		        System.out.println(reject);
	            
	        }
	       // String accept=request.getParameter("accept");
	       // String reject=request.getParameter("reject");
	        
	        System.out.println(friend);
	   //     System.out.println(accept);
	  //      System.out.println(reject);
	        
	     /*   if(friend.equals(null))
	        {
	        	out.println("<script type=\"text/javascript\">");
	        	   out.println("alert('Enter valid username');");
	        	   out.println("location='AddFriend.jsp';");
	        	   out.println("</script>");
	        	   
	        }
	       
	        
	        else if(friend.equals(user.getUsername()))
			{
	        	out.println("<script type=\"text/javascript\">");
	        	   out.println("alert('Enter valid username');");
	        	   out.println("location='AddFriend.jsp';");
	        	   out.println("</script>");
			}
	        else
	        {
	        	Request request1=new Request();
	        	if(accept.equals("submit")){
	        	request1.request_confirmed(user,friend);
				
				System.out.println("Request Confirmed");
	        	}
	        	else
	        	{
	        		request1.request_rejected(user.getUsername(), friend);
					System.out.println("Request Rejected");
	        	}
	        }
	        request.getRequestDispatcher("/homepage.jsp").forward(request, response);	*/
	}

}
