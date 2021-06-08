import java.sql.*;

public class InsertSingleRowDemo {
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

		String SQL_QUERY = "insert into player values(1212, 'Pollock', 'Captown', 'South Africa')";

		try (Connection con = DriverManager.getConnection(jdbc_url, user, pwd)) {
			Statement st = con.createStatement();
			int updateCount = st.executeUpdate(SQL_QUERY);
			System.out.println("The Number of Rows affected :" + updateCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
