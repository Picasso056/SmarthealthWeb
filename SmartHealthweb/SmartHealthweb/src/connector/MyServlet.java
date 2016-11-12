package connector;



import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dataObject.EndUserDAO;
import connector.smartHealth;
import bean.Admin;
import bean.Moderator;
import bean.Person;
import bean.User;



public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
  

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	  PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        System.out.println("hello");
      
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        String pwd2 = request.getParameter("pwd2");
        String pemail = request.getParameter("pemail");
        String semail = request.getParameter("semail");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String aboutme = request.getParameter("aboutme");
        String url1 = request.getParameter("url1");
        String url2 = request.getParameter("url2");
        String url3 = request.getParameter("url3");
        String address = request.getParameter("address");
        String contact=request.getParameter("contact");
        String type=request.getParameter("type");
        
        String qual1=request.getParameter("qual1");
        String qual2=request.getParameter("qual2");
        String qual3=request.getParameter("qual3");
        String qual4=request.getParameter("qual4");
        String qual5=request.getParameter("qual5");
        String qual6=request.getParameter("qual6");
        System.out.println(qual1);
        System.out.println(qual2);
        System.out.println(qual3);
        System.out.println(qual4);
        System.out.println(qual5);
        System.out.println(qual6);
        
        
        
        
    if(pwd.equals(pwd2)){
       if(dataObject.smarthealthDAO.uniqueness_username(uname)==true&&dataObject.smarthealthDAO.uniqueness_email(pemail))
        {
    	   
        	
        	if(type.equals("User"))
        	{
        		Person user=new Person();
        		user.setUsername(uname);
            	user.setPassword(pwd);
            	user.setPrimary_email(pemail);
            	user.setSecondary_email(semail);
            	user.setFirst_name(fname);
            	user.setLast_name(lname);
            	user.setAbout_me(aboutme);
            	user.setURL1(url1);
            	user.setURL2(url2);
            	user.setURL3(url3);
            	user.setPostal_address(address);
            	user.setPostal_address1(address);
            	user.setPostal_address2(address);
            	user.setPostal_address3(address);
            	user.setPostal_address4(address);
            	user.setIs_active(1);
            	user.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
        		dataObject.EndUserDAO.addEnduser(user);
        		HttpSession session=request.getSession();
	        
	        	session.setAttribute("user", user);
	        	System.out.println("added");
	        	request.getRequestDispatcher("/homepage.jsp").forward(request, response);
        	}
        	else if(type.equals("Admin"))
        	{
        		Admin user=new Admin();
        		user.setUsername(uname);
            	user.setPassword(pwd);
            	user.setPrimary_email(pemail);
            	user.setSecondary_email(semail);
            	user.setFirst_name(fname);
            	user.setLast_name(lname);
            	user.setAbout_me(aboutme);
            	user.setURL1(url1);
            	user.setURL2(url2);
            	user.setURL3(url3);
            	user.setPostal_address(address);
            	user.setPostal_address1(address);
            	user.setPostal_address2(address);
            	user.setPostal_address3(address);
            	user.setPostal_address4(address);
            	user.setIs_active(1);
            	user.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
        		user.setContact(contact);
        		
        		HttpSession session=request.getSession();
	        
	        	session.setAttribute("user", user);
	        	request.getRequestDispatcher("/homepage.jsp").forward(request, response);
        		dataObject.AdminDAO.addAdmin(user);
        	}
        	else if(type.equals("Moderator"))
        	{
        		
        		Moderator user=new Moderator();
        		user.setUsername(uname);
            	user.setPassword(pwd);
            	user.setPrimary_email(pemail);
            	user.setSecondary_email(semail);
            	user.setFirst_name(fname);
            	user.setLast_name(lname);
            	user.setAbout_me(aboutme);
            	user.setURL1(url1);
            	user.setURL2(url2);
            	user.setURL3(url3);
            	user.setPostal_address(address);
            	user.setPostal_address1(address);
            	user.setPostal_address2(address);
            	user.setPostal_address3(address);
            	user.setPostal_address4(address);
            	user.setIs_active(1);
            	user.setDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
            	user.setContact(contact);
        		dataObject.ModeratorDAO.addModerator(user);
        		qualifications q=new qualifications();
        		if(qual1!=null)
        		q.enter_qualification(qual1, user.getPrimary_email());
        		if(qual2!=null)
            		q.enter_qualification(qual2, user.getPrimary_email());
        		if(qual3!=null)
            		q.enter_qualification(qual3, user.getPrimary_email());
        		if(qual4!=null)
            		q.enter_qualification(qual4, user.getPrimary_email());
        		if(qual5!=null)
            		q.enter_qualification(qual5, user.getPrimary_email());
        		if(qual6!=null)
            		q.enter_qualification(qual6, user.getPrimary_email());
        		
        		HttpSession session=request.getSession();
	      
	        	session.setAttribute("user", user);
	        	request.getRequestDispatcher("/homepage.jsp").forward(request, response);
        		
        	}
        	
        }
       else if(dataObject.smarthealthDAO.uniqueness_username(uname)==false)
       {
    	   out.println("<script type=\"text/javascript\">");
    	   out.println("alert('Username not unique');");
    	   out.println("location='firstpage.jsp';");
    	   out.println("</script>");
       }
       else if(dataObject.smarthealthDAO.uniqueness_email(pemail))
       {
    	   out.println("<script type=\"text/javascript\">");
    	   out.println("alert('primary email not unique');");
    	   out.println("location='firstpage.jsp';");
    	   out.println("</script>");
       }
    }
    else
    {
    	out.println("<script type=\"text/javascript\">");
 	   out.println("alert('password does not match');");
 	   out.println("location='firstpage.jsp';");
 	   out.println("</script>");
    }
        	
            //System.out.println(type);
        //	System.out.println("hello2");

        out.close();
    }


}
