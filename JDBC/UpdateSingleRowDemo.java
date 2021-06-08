import java.sql.*;

public class UpdateSingleRowDemo {
	public static void main(String[] args) throws Exception {
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

		try (Connection con = DriverManager.getConnection(jdbc_url, user, pwd)) {
			Statement st = con.createStatement();
			int updateCount = st.executeUpdate("update employee set sal = sal - 500 where eid = 7");
			System.out.println("The Number of Rows updated :" + updateCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
