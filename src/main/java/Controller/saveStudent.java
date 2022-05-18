package Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.impl.StudentDAOImpl;
import Model.student;

@WebServlet("/saveStudent")
public class saveStudent extends HttpServlet{
	private static final long serialVersionUID = 1L;
	StudentDAOImpl stdo = new StudentDAOImpl();
	
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
		st.setStudentnumber(id);
		st.setName(name);
		st.setLastname(lastname);
		st.setDob(strdate);
		st.setPhone(phone);
		st.setAddress(address);
		st.setFaculty(faculty);
		stdo.insertStudent(st);
		resp.sendRedirect("list");
	}
}
