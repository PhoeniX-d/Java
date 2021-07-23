package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

	String jdbcURL = "jdbc:mysql://localhost:3306/pranav";
	String jdbcUser = "root";
	String jdbcPwd = "";

	public boolean check(String uname, String upwd) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPwd);
			PreparedStatement pst = con.prepareStatement("SELECT * FROM users WHERE uname=? and upwd=?");
			pst.setString(1, uname);
			pst.setString(2, upwd);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
