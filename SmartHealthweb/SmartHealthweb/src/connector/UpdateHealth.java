package connector;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Health;
import bean.Person;
import bean.User;
import dataObject.HealthDAO;
import dataObject.Request;

/**
 * Servlet implementation class UpdateHealth
 */
@WebServlet("/UpdateHealth")
public class UpdateHealth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateHealth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession(true);
		Person person = (Person)session.getAttribute("user");
		Health health=new Health();
	System.out.println("point 1");
	      response.setContentType("text/html");
	       
	        int type=(int) session.getAttribute("type");
	        
	   
		       HealthDAO healthdata=new HealthDAO();
		       System.out.println("point 2");
	        	healthdata.view_friendhealthdata(person.getUsername());
	        	System.out.println("point 3");
				ArrayList<String> userhealthname=healthdata.getHealthName();
				ArrayList<String> userhealthvalue=healthdata.getHealthValue();
				session.setAttribute("userhealthname", userhealthname);
				session.setAttribute("userhealthvalue", userhealthvalue);
				System.out.println(userhealthname);
				System.out.println(userhealthvalue);
				System.out.println("point 4");
					request.getRequestDispatcher("/UpdateHealth.jsp").forward(request, response);
				
	        	
		      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession session=request.getSession();
	       response.setContentType("text/html");
	        System.out.println("hello");
	 
	        User user=(User) session.getAttribute("user");
	        
	        ArrayList<String> friends = (ArrayList<String>)session.getAttribute("userhealthname");
	        System.out.println(friends);
	        HealthDAO healthData=new HealthDAO();
	        for(String user1 : friends){
	        	System.out.println(user1);
	        
	        	
	        	String healthname=request.getParameter("label["+user1+"]");
		        String healthvalue=request.getParameter("value["+user1+"]");
		        
		        System.out.print("health value: "+healthvalue);
	        	System.out.println("health name: "+user1);
		        if(healthvalue!=""){
		        	System.out.println(healthvalue);
		        	System.out.println(user1);
		        	Health health=new Health();
		        	health.setvalue(healthvalue);
		        	health.setname(user1);
		        	health.setusername(user.getUsername());
		        	healthData.health_update(health, user1);
	        	
		        	
				
	        	}
		        
	            
	        }
	        session.removeAttribute("userhealthname");
			session.removeAttribute("userhealthvalue");
	        healthData.view_friendhealthdata(user.getUsername());
        	System.out.println("point 3");
			ArrayList<String> userhealthname=healthData.getHealthName();
			ArrayList<String> userhealthvalue=healthData.getHealthValue();
			
			session.setAttribute("userhealthname", userhealthname);
			session.setAttribute("userhealthvalue", userhealthvalue);
			System.out.println(userhealthname);
			System.out.println(userhealthvalue);
			System.out.println("point 4");
	        System.out.println("Updated");
			request.getRequestDispatcher("/UpdateHealth.jsp").forward(request, response);	
        	
	}
	

}
