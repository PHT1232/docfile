package DAO.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import DAO.DAOService;
import DAO.StudentDAO;
import Model.student;

public class StudentDAOImpl implements StudentDAO{

	@Override
	public List<student> getStudent() {
		// TODO Auto-generated method stub
		Connection conn = DAOService.connect();
		Statement stmt;
		List<student> ls = new ArrayList<student>();
		try {
			stmt = (Statement) conn.createStatement();
			String sql = "Select * from student";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				student st = new student();
				st.setStudentnumber(rs.getString("studentnumber"));
				st.setName(rs.getString("name"));
				st.setLastname(rs.getString("lastname"));
				st.setPhone(rs.getString("phone"));
				st.setAddress(rs.getString("address"));
				st.setFaculty(rs.getString("faculty"));
				st.setDob(rs.getString("DoB"));
				ls.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ls;
	}

	@Override
	public void insertStudent(student st) {
		// TODO Auto-generated method stub
		Connection conn = DAOService.connect();
		Statement stmt;
		
		String sql = "Insert into student values('" + st.getStudentnumber() + "', '" + st.getName() + "', '" + st.getLastname() + "', '" + st.getPhone() + "', '" + st.getAddress() + "', '" + st.getFaculty() + "', '" + st.getDob() + "')";
		System.out.println(sql);
		try {
			stmt = (Statement) conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("already inserted data");
		} catch (SQLException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(String id) {
		// TODO Auto-generated method stub
		Connection conn = DAOService.connect();
		Statement stmt;
		String sql = "Delete from student where studentnumber = '" + id + "'";
		try {
			stmt = (Statement) conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("deleted data");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent(String id, student st) {
		// TODO Auto-generated method stub
		Connection conn = DAOService.connect();
		Statement stmt;
		String sql = "Update student set name = '" + st.getName() + "', lastname = '" + st.getLastname() + "', phone = '" + st.getPhone() + "', address = '" + st.getAddress() + "', faculty = '" + st.getFaculty() + "', dob = '" + st.getDob() + "' where studentnumber = '" + id + "'";
		try {
			stmt = (Statement) conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("delete data");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Override
	public student selectStudent(String id) {
		// TODO Auto-generated method stub
		Connection con = DAOService.connect();
		Statement stmt = null;
		String sql = "Select * from student where studentnumber = '" + id + "'";
		System.out.println(sql);
		student st = new student();
		try {
			stmt = (Statement) con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				st.setStudentnumber(rs.getString("studentnumber"));
				st.setName(rs.getString("name"));
				st.setLastname(rs.getString("lastname"));
				st.setPhone(rs.getString("phone"));
				st.setAddress(rs.getString("address"));
				st.setFaculty(rs.getString("faculty"));
				st.setDob(rs.getString("DoB"));
				return st;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
