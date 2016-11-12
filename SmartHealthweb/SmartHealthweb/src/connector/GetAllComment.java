package connector;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Decoder.Text;

import dataObject.CommentDAO;
import bean.Comment;
import bean.User;

/**
 * Servlet implementation class GetAllComment
 */
@WebServlet("/GetAllComment")
public class GetAllComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllComment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		int id = Integer.parseInt((String)session.getAttribute("id"));
		User user = (User)session.getAttribute("user");
		String postusername = request.getParameter("name");
		String date = ((String)request.getParameter("time"));
	//	java.sql.Date sDate = (java.sql.Date)date;
		Timestamp sdate = null;
		System.out.println("INSISDE GET ALL COMMENT "+ date);

		java.util.Date df;
		try {
			df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date);
			System.out.println("DF"+ df);
			 sdate = new Timestamp(df.getTime());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("INSIDE GET ALL COMMENT sdate"+ sdate);
		session.setAttribute("postdate", sdate);
		session.setAttribute("postuser", postusername);
		
		 ArrayList<Comment> comment = CommentDAO.getCommentWeb(id,postusername,sdate);
		 request.setAttribute("allcomment", comment);
		 
		 RequestDispatcher rd = request.getRequestDispatcher("allcomment.jsp");
			rd.forward(request, response);
		
		
		
		
		
		
		System.out.println("PostUsername : "+postusername+ " "+date);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
