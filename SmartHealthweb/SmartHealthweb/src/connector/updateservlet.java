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

import bean.Admin;
import bean.Moderator;
import bean.Person;
import bean.User;

/**
 * Servlet implementation class updateservlet
 */
@WebServlet("/updateservlet")
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  PrintWriter out = response.getWriter();
	        response.setContentType("text/html");
	        System.out.println("update");
	      
	        HttpSession session=request.getSession();
	        String pwd = request.getParameter("pwd");
	     
	        String semail = request.getParameter("semail");
	        String fname = request.getParameter("fname");
	        String lname = request.getParameter("lname");
	        String aboutme = request.getParameter("aboutme");
	        String url1 = request.getParameter("url1");
	        String url2 = request.getParameter("url2");
	        String url3 = request.getParameter("url3");
	        String address = request.getParameter("address");
	       // String type=request.getParameter("type");
	        String contact;
	        int type=(int) session.getAttribute("type");
	       
	        Moderator moderator;
	        Admin admin;
	        Person person;
	        User user=(User) session.getAttribute("user");;
	   //     System.out.println(user.getUsertypeid());
	        if(type==4)
	        {
	        	moderator=(Moderator) session.getAttribute("user");
	        	contact=request.getParameter("contact");
	        	if(!contact.equals(""))
	        		moderator.setContact(contact);
	        //	user=moderator;
	        	
	        }
	        else if(type==5)
	        {
	        	admin=(Admin) session.getAttribute("user");
	        	contact=request.getParameter("contact");
	        	if(!contact.equals(""))
	        		admin.setContact(contact);
	      //  	user=admin;
	        	
	        }
	        
	     //  if(connector.smarthealthDAO.uniqueness_username(uname)==true&&connector.smarthealthDAO.uniqueness_email(pemail))
	    //    {
	       
	        	
	        	
	        if(!pwd.equals(""))
	        	user.setPassword(pwd);
	    
	        if(!semail.equals(""))
	        	user.setSecondary_email(semail);
	        if(!fname.equals(""))
	        	user.setFirst_name(fname);
	        if(!lname.equals(""))
	        	user.setLast_name(lname);
	        if(!aboutme.equals(""))
	        	user.setAbout_me(aboutme);
	        if(!url1.equals(""))
	        	user.setURL1(url1);
	        if(!url2.equals(""))
	        	user.setURL2(url2);
	        if(!url3.equals(""))
	        	user.setURL3(url3);
	        if(!address.equals(""))
	        	user.setPostal_address(address);
	        if(!address.equals(""))
	        	user.setPostal_address1(address);
	        if(!address.equals(""))
	        	user.setPostal_address2(address);
	        if(!address.equals(""))
	        	user.setPostal_address3(address);
	        if(!address.equals(""))
	        	user.setPostal_address4(address);
	      //  System.out.println(User.getUsertypeid());
	     	try{
    			Class.forName("com.mysql.jdbc.Driver");
    			System.out.println("1");
    			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarthealthdb?useSSL=false","root","Mayank@08");
    			System.out.println("2");
    			PreparedStatement ps ;
    			 if(type==4)
    			 {
    				 ps = connection.prepareStatement("update  `smarthealthdb`.`Moderator` set Phone=? where Username=?");
    				 moderator=(Moderator) session.getAttribute("user");
    					ps.setString(1, moderator.getContact());
    					ps.setString(2, moderator.getUsername());
    					ps.executeUpdate();
    			
    			ps.executeUpdate();
    			 }
    			 else if(type==5)
    			 {
    				 ps = connection.prepareStatement("update  `smarthealthdb`.`Administrator` set Phone=? where Username=?");
    				 admin=(Admin) session.getAttribute("user");
    					ps.setString(1, admin.getContact());
    					ps.setString(2, admin.getUsername());
    					ps.executeUpdate();
    			 }
    			ps = connection.prepareStatement("update `smarthealthdb`.`User` set Username=?,Password=?,Email1=?,Email2=?,FirstName=?,LastName=?,AboutMe=?,PhotoURL1=?,PhotoURL2=?,PhotoURL3=?,StreetNumber=?,StreetName=?,MajorMunicipality=?,GoverningDistrict=?,PostalArea=? where Username=?;");
    			ps.setString(1, user.getUsername());
    			ps.setString(2, user.getPassword());
    			ps.setString(3, user.getPrimary_email());
    			ps.setString(4, user.getSecondary_email());
    			ps.setString(5, user.getFirst_name());
    			ps.setString(6, user.getLast_name());
    			ps.setString(7, user.getAbout_me());
    			ps.setString(8, user.getURL1());
    			ps.setString(9, user.getURL2());
    			ps.setString(10, user.getURL3());
    			ps.setString(11, user.getPostal_address());
    			ps.setString(12, user.getPostal_address());
    			ps.setString(13, user.getPostal_address());
    			ps.setString(14, user.getPostal_address());
    			ps.setString(15, user.getPostal_address());
    			ps.setString(16, user.getUsername());
    			ps.executeUpdate();
    			//System.out.println("4");
    			connection.close();
    			//data_object.closeConnection(connection);
    		}catch(Exception e){
    			System.out.println(e.getMessage());
    			//System.out.println("hi");
    			
    		}
	        System.out.println(user.getUsername());
	        System.out.println(user.getFirst_name());
	        System.out.println(user.getLast_name());
	        System.out.println(user.getPrimary_email());
	    	
	    	if(type==4)
	    	{
	    			        	
	        	session.setAttribute("user", user);
	        	session.setAttribute("type", type);
	        	request.getRequestDispatcher("homepagemoderator.jsp").forward(request, response);
	    	}
	    	else if(type==5)
	    	{
	    		
	        	session.setAttribute("user", user);
	        	session.setAttribute("type", type);
	        	request.getRequestDispatcher("homepageadmin.jsp").forward(request, response);
	    	}
	    	else
	    	{
	    		session.setAttribute("type", type);
	        	session.setAttribute("user", user);
	        	
	        	request.getRequestDispatcher("homepage.jsp").forward(request, response);
	    	}
        	


	}

}
