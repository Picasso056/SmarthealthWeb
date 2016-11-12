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

import dataObject.Request;
import bean.Person;

/**
 * Servlet implementation class ViewFriends
 */
@WebServlet("/ViewFriends")
public class ViewFriends extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewFriends() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession httpsession = request.getSession(true);
		Person person = (Person)httpsession.getAttribute("user");
		Request re = new Request();
		ArrayList<String>friends = re.friends_view(person.getUsername());
		request.setAttribute("myfriends", friends);
		httpsession.setAttribute("myfriends", friends);
		RequestDispatcher rd = request.getRequestDispatcher("ViewFriend.jsp");
		rd.forward(request, response);				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
