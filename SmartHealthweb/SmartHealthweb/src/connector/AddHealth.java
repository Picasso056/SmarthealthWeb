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

/**
 * Servlet implementation class AddHealth
 */
@WebServlet("/AddHealth")
public class AddHealth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddHealth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
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
					request.getRequestDispatcher("/AddHealth.jsp").forward(request, response);
				
	        	
		       
		        
	            
	        
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		HttpSession session = request.getSession(true);
		Person person = (Person)session.getAttribute("user");
		Health health=new Health();
	
	      response.setContentType("text/html");
	       
	        int type=(int) session.getAttribute("type");
	        
	        String healthname=request.getParameter("healthname");
	        String healthvalue=request.getParameter("healthvalue");
		       HealthDAO healthData=new HealthDAO();
		       Health healthadd=new Health();
		   
		   healthadd.setusername(person.getUsername());
		   healthadd.setname(healthname);
		   healthadd.setvalue(healthvalue);
	     healthData.healthdata(healthadd);
	     healthData.view_friendhealthdata(person.getUsername());
				ArrayList<String> userhealthname=healthData.getHealthName();
				ArrayList<String> userhealthvalue=healthData.getHealthValue();
				System.out.println("point 1");
			
				session.removeAttribute("userhealthname");
				session.removeAttribute("userhealthvalue");
				session.setAttribute("userhealthname", userhealthname);
					session.setAttribute("userhealthvalue", userhealthvalue);
				System.out.println(userhealthname);
				System.out.println(userhealthvalue);
				System.out.println("point 2");
					request.getRequestDispatcher("/AddHealth.jsp").forward(request, response);
				
	        	
		      
	}

}
