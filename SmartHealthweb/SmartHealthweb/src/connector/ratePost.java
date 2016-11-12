package connector;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dataObject.PostDAO;
import bean.Rating;
import bean.User;

/**
 * Servlet implementation class ratePost
 */
@WebServlet("/ratePost")
public class ratePost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ratePost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		User user = (User)session.getAttribute("user");
		
		String raterusername = user.getUsername();
		String name = (String)request.getParameter("Username");
		String date = request.getParameter("Time");
		
		
		
		
		
		
		System.out.println("date"+date);
		Timestamp sdate = null;
		java.util.Date df;
		try {
			df = new SimpleDateFormat("dd-MM-yyyy@hh:mm:ss").parse(date);
			System.out.println("DF"+ df);
			 sdate = new Timestamp(df.getTime());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("sdare"+sdate);
		String val = (String)request.getParameter("rate");
		int value = Integer.parseInt(val);
		
		Rating rate = new Rating(name,sdate,raterusername,value);
		PostDAO.RatePost(rate);
		
		if(user.getUsertypeid() == 4)
		request.getRequestDispatcher("/homepagemoderator.jsp").forward(request, response);
		
		else if(user.getUsertypeid() == 5)
			request.getRequestDispatcher("/homepageadmin.jsp").forward(request, response);
	
		else
			request.getRequestDispatcher("/homepage.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}