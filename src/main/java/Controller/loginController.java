package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.LoginService;

@WebServlet("/login")
public class loginController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId, Pass;
		userId = req.getParameter("username");
		Pass = req.getParameter("password");
		System.out.println("This is userId" + userId);
		System.out.println("This is userId" + Pass);
		LoginService lgs = new LoginService();
		
		boolean result = lgs.authenticate(userId, Pass);
		
		if (result) {
			HttpSession session = req.getSession();
			session.setAttribute("username", userId);
			session.setAttribute("password", Pass);
			System.out.println("userId " + userId);
			resp.sendRedirect("list");
			return;
		} else {
			resp.sendRedirect("login.jsp");
			return;
		}
	}
}
