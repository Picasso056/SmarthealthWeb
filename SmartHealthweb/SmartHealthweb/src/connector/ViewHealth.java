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

import bean.Person;
import bean.User;
import dataObject.HealthDAO;
import dataObject.Request;

/**
 * Servlet implementation class ViewHealth
 */
@WebServlet("/ViewHealth")
public class ViewHealth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewHealth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession httpsession = request.getSession(true);
		Person person = (Person)httpsession.getAttribute("user");
		Request re = new Request();
		ArrayList<String>friends = re.friends_view(person.getUsername());
		request.setAttribute("myfriends", friends);
		httpsession.setAttribute("myfriends", friends);
		ArrayList healthname=null;
		ArrayList healthvalue=null;
		httpsession.setAttribute("healthname", healthname);
		httpsession.setAttribute("healthvalue", healthvalue);
		RequestDispatcher rd = request.getRequestDispatcher("ViewHealth.jsp");
		rd.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		HttpSession session=request.getSession();
	       response.setContentType("text/html");
	        System.out.println("hello");
	        System.out.println("friends entered");
	        int type=(int) session.getAttribute("type");
	        User user=(User) session.getAttribute("user");
	   //     String friend=request.getParameter("Text1");
	        ArrayList<String> friends = (ArrayList<String>)session.getAttribute("myfriends");
	        System.out.println(friends);
	        System.out.println("friends entered2");
	        for(String user1 : friends){
	        	
	        	System.out.println(user1);
	        	
	        	String health=request.getParameter("health["+user1+"]");
		  //      String reject=request.getParameter("reject["+user1+"]");
		       HealthDAO healthdata=new HealthDAO();
		        if(health!=null){
		        	System.out.println("In a loop");
	        	if(health.equals("ViewHealth")){
	        		System.out.println("Inside a loop");
	        	healthdata.view_friendhealthdata(user1);
				ArrayList<String> healthname=healthdata.getHealthName();
				ArrayList<String> healthvalue=healthdata.getHealthValue();
				session.setAttribute("healthname", healthname);
				session.setAttribute("healthvalue", healthvalue);
				System.out.println(healthname);
				System.out.println(healthvalue);
				if(healthvalue.equals(null))
					request.getRequestDispatcher("/ViewHealth.jsp").forward(request, response);
				else{
				System.out.println("Request Confirmed");
				request.getRequestDispatcher("/ViewHealth2.jsp").forward(request, response);	
	        	}}
	        	}
		        System.out.println(health);
		        
	            
	        }
		
	}

}
