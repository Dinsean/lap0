package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;


public class EmailListServlet extends HttpServlet{
	
	private static final long serialVersionUID = 3968127296581258672L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		String url = "/index.html";
		// get current action
		String action = request.getParameter("action");
		if (action == null) {
			action = "join"; // default action
		}
		// perform action and set URL to appropriate page
		if (action.equals("join")) {
			url = "/index.html"; // the "join" page
		}
		else if (action.equals("add")) {
			// get parameters from the request
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			String dateOfBirth = request.getParameter("dateOfBirth");
			String contactVia = request.getParameter("contactVia");
			String replyUs = request.getParameter("replyUs");
			String yourChoose = request.getParameter("yourChoose");
			// store data in User object and save User object in database
			User user = new User(firstName,lastName, email, dateOfBirth, contactVia, replyUs, yourChoose);
			
			// set User object in request object and set URL
			request.setAttribute("user", user);
					url = "/thank.jsp"; // the "thanks" page
}
		// forward request and response objects to specified URL
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request, response);
	}
			@Override
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
			}
			

}