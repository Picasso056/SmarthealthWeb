package connector;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dataObject.ModeratorDAO;
import dataObject.smarthealthDAO;
import bean.Admin;
import bean.Moderator;
import bean.Person;
import bean.User;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  PrintWriter out = response.getWriter();
	        response.setContentType("text/html");
	        System.out.println("hello");
	        String unamelogin=request.getParameter("unamelogin");
	        String passwordlogin=request.getParameter("passwordlogin");
	        System.out.println(unamelogin);
	        System.out.println(passwordlogin);
	        int type=smarthealthDAO.authenticatelogin(unamelogin, passwordlogin);
	        if(type!=0)
	        {
	 	
	        	HttpSession session=request.getSession();
	        	System.out.println(type);
	        	User user=null;
	        	if(type==5)
	        	{
	        		user=smartHealth.get_user();
	        		session.setAttribute("uname", unamelogin);
	        		session.setAttribute("type", type);
	        		session.setAttribute("user", user);
	        		
	        		request.getRequestDispatcher("/homepageadmin.jsp").forward(request, response);
	        	}
	        	else if(type==1||type==2||type==3)
	        	{
	        		user=smartHealth.get_user();
	        		System.out.println(user.getUsername());
	        		System.out.println(user.getPrimary_email());
	        		session.setAttribute("type", type);
	        		session.setAttribute("uname", unamelogin);
	        		session.setAttribute("user", user);
	        		
	        		
	        		request.getRequestDispatcher("/homepage.jsp").forward(request, response);	
	        	}
	        	else if(type==4)
	        	{
	        		user=smartHealth.get_user();
	        		session.setAttribute("uname", unamelogin);
	        		session.setAttribute("type", type);
	        		session.setAttribute("user", user);
	        		ModeratorDAO.show_qualification(user.getUsername());
	        		
	        		request.getRequestDispatcher("/homepagemoderator.jsp").forward(request, response);
	        	}
	        	
	        }
	        else
	        {
	        	out.println("<script type=\"text/javascript\">");
	        	   out.println("alert('User or password incorrect');");
	        	   out.println("location='firstpage.jsp';");
	        	   out.println("</script>");
	        	
	        //	request.getRequestDispatcher("/firstpage.jsp").forward(request, response);
	        	//response.sendRedirect("/firstpage.jsp");
	        }
	}

}
