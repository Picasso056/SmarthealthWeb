package connector;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Admin;
import bean.Moderator;
import bean.Person;
import bean.User;
import dataObject.Request;

/**
 * Servlet implementation class homeservlet
 */
@WebServlet("/homeservlet")
public class homeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public homeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		HttpSession httpsession = request.getSession(true);
		User user = (User) httpsession.getAttribute("user");
		int type=(int) httpsession.getAttribute("type");
		
		if(type==5)
    	{
    		
    		//session.setAttribute("uname", unamelogin);
    		
    		
    		request.getRequestDispatcher("/homepageadmin.jsp").forward(request, response);
    		return;
    	}
    	else if(type==1||type==2||type==3)
    	{
    		
    		//session.setAttribute("uname", unamelogin);
    	//	session.setAttribute("user", new Person());
    		
    		
    		request.getRequestDispatcher("/homepage.jsp").forward(request, response);
    		return;
    	}
    	else if(type==4)
    	{
    		//session.setAttribute("uname", unamelogin);
    		
    		request.getRequestDispatcher("/homepagemoderator.jsp").forward(request, response);
    			return;
    	
    }
		RequestDispatcher rd = request.getRequestDispatcher("homepage.jsp");
		rd.forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	/*	 PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session=request.getSession();
    	System.out.println("homeservlet");
    	if(User.getUsertypeid()==5)
    	{
    		
    		//session.setAttribute("uname", unamelogin);
    		session.setAttribute("user", new Admin());
    		
    		request.getRequestDispatcher("/homepageadmin.jsp").forward(request, response);
    	}
    	else if(User.getUsertypeid()==1||User.getUsertypeid()==2||User.getUsertypeid()==3)
    	{
    		
    		//session.setAttribute("uname", unamelogin);
    	//	session.setAttribute("user", new Person());
    		
    		
    		request.getRequestDispatcher("/homepage.jsp").forward(request, response);	
    	}
    	else if(User.getUsertypeid()==4)
    	{
    		//session.setAttribute("uname", unamelogin);
    		session.setAttribute("user", new Moderator());
    		
    		request.getRequestDispatcher("/homepagemoderator.jsp").forward(request, response);
    	
    	
    }*/
	}

}
