package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOService;
import Model.registerModel;

@WebServlet("/RegisterServlet")
public class registerServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rq = req.getRequestDispatcher("views/RegisterPage.jsp");
		rq.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("userID");
		String pass = req.getParameter("password");
		String repass = req.getParameter("repassword");
		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String email = req.getParameter("emailaddress");
		String squestion = req.getParameter("question");
		String answer = req.getParameter("answer");
		String phone = req.getParameter("phone");
		
		registerModel regModel = new registerModel();
		PassProcess pp = new PassProcess();
		String encodepass = pp.encodepass(pass);
		regModel.setUsername(username);
		regModel.setPassword(encodepass);
		regModel.setFirstName(fname);
		regModel.setLastName(lname);
		regModel.setEmail(email);
		regModel.setSecurityQuestion(squestion);
		regModel.setSecurityAnswer(answer);
		regModel.setPhoneNumber(phone);
		
		String sql = "Insert into register values (?,?,?,?,?,?,?,?)";
		if (!DAOService.checkexist(username) && pass.equals(repass)) {
			int i = DAOService.registerUser(regModel, sql);
			if (i != 0) {
				RequestDispatcher rq = req.getRequestDispatcher("views/successRegister.jsp");
				req.setAttribute("username", username);
				rq.forward(req, resp);
				System.out.println("value inserted!!");
				return;
			} else {
				System.out.println("value not inserted !!");
				resp.sendRedirect("RegisterPage.jsp");
				return;
			}
		}
	}
}
