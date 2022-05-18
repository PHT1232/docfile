package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.impl.StudentDAOImpl;
import Model.student;

@WebServlet("/updateStudent")
public class updateStudent extends HttpServlet{
	
	StudentDAOImpl std = new StudentDAOImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("studentId");
		System.out.println(id);
		student st = std.selectStudent(id);
		System.out.println(st.getAddress());
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/views/updateStudent.jsp");
		req.setAttribute("student", st);
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		student st = new student();
		String id = req.getParameter("studentnumber");
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		
		String strdate = req.getParameter("dob");
		String phone = req.getParameter("phoneNumber");
		String address = req.getParameter("address");
		String faculty = req.getParameter("faculty");
		st.setName(name);
		st.setLastname(lastname);
		st.setDob(strdate);
		st.setPhone(phone);
		st.setAddress(address);
		st.setFaculty(faculty);
		std.updateStudent(id, st);
		resp.sendRedirect("list");
	}
}
