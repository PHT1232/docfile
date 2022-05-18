package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.impl.StudentDAOImpl;

@WebServlet("/deleteStudent")
public class deleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentDAOImpl stdo = new StudentDAOImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("studentID");
		stdo.deleteStudent(id);
		resp.sendRedirect("list");
	}
}
