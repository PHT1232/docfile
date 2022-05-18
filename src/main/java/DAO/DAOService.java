package DAO;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Model.registerModel;

public class DAOService {
	
	public static Connection connect() {
		Connection conn = null;
		String jdbcUrl = "jdbc:mysql://localhost:3306/nguyentanphat_dh9c5";
		String user = "root";
		String pass = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connect to database");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	
	public static int registerUser(registerModel regModel, String sql) {
		int i = 0;
		Connection con = connect();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, regModel.getUsername());
			ps.setString(2, regModel.getPassword());
			ps.setString(3, regModel.getFirstName());
			ps.setString(4, regModel.getLastName());
			ps.setString(5, regModel.getEmail());
			ps.setString(6, regModel.getSecurityQuestion());
			ps.setString(7, regModel.getPhoneNumber());
			ps.setString(8, regModel.getSecurityAnswer());
			i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return i;
	}
	
	public static boolean checkexist(String name) {
		Connection con = connect();
		PreparedStatement pstm;
		try {
			String query = "Select * from register where username = ?";
			pstm = (PreparedStatement) con.prepareStatement(query);
			pstm.setString(1, name);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				return true;
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
