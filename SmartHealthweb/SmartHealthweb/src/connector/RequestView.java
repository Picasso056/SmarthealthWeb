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
import dataObject.Request;

/**
 * Servlet implementation class RequestView
 */
@WebServlet("/RequestView")
public class RequestView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestView() {
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
		ArrayList<String>ViewRequest = re.request_view(person.getUsername());
		request.setAttribute("ViewRequest", ViewRequest);
		httpsession.setAttribute("request", ViewRequest);
		RequestDispatcher rd = request.getRequestDispatcher("ViewRequest.jsp");
		rd.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
