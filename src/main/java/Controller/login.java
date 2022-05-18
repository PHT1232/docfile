package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.LoginService;

@WebServlet("/loginservet")
public class login extends HttpServlet {
	private static final long serialVersionUID= 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String UserID, Pass;
		UserID = req.getParameter("userID");
		Pass = req.getParameter("password");
		RequestDispatcher rq = req.getRequestDispatcher("views/success.jsp");
		LoginService loginsv = new LoginService();
		boolean result = loginsv.authenticate(UserID, Pass);
		
		if (result) {
			req.setAttribute("username", UserID);
			rq.forward(req, resp);
			return;
		} else {
			resp.sendRedirect("login.jsp");
			return;
		}
	}
}
