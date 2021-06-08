import java.sql.*;

public class RowCountDemo {
	public static void main(String[] args) throws SQLException {
		java.util.Properties p = new java.util.Properties();
		try {
			java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
			p.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String jdbc_url = p.getProperty("OracleURL");
		String user = p.getProperty("OracleUser");
		String pwd = p.getProperty("OraclePwd");

		String sql_query = "select count(*) from employee";
		try (Connection con = DriverManager.getConnection(jdbc_url, user, pwd)) {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql_query);
			if (rs.next()) {
				System.out.print("Total Number of Rows present are\t:" + rs.getInt(1));
			}
		}
	}
}