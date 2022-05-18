package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.StudentDAO;
import DAO.impl.StudentDAOImpl;
import Model.student;

@WebServlet("/list")
public class listStudent extends HttpServlet{
	private static final long serialVersionUID = 1L;
	StudentDAOImpl std = new StudentDAOImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<student> students = std.getStudent();
		HttpSession userSession = req.getSession();
		String user = (String) userSession.getAttribute("username");
		String pass = (String) userSession.getAttribute("password");
		if (user.compareTo("admin") == 0 && pass.compareTo("1234") == 0) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/views/list-student.jsp");
			req.setAttribute("student", students);
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/views/list-student-normal.jsp");
			req.setAttribute("student", students);
			rd.forward(req, resp);
		}
	}
}
