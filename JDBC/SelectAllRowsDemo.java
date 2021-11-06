import java.sql.*;

public class SelectAllRowsDemo {
	public static void main(String[] args) throws Exception {
		java.util.Properties p = new java.util.Properties();
		java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
		p.load(fis);
		String jdbc_url = p.getProperty("OracleURL");
		String user = p.getProperty("OracleUser");
		String pwd = p.getProperty("OraclePwd");
		System.out.println(jdbc_url + user + pwd);
		try (Connection con = DriverManager.getConnection(jdbc_url, user, pwd)) {
			Statement st = con.createStatement();
			String sqlQuery = "select * from employee";
			// String sqlQuery="select * from employee where sal > 12000";
			boolean flag = false;
			// System.out.println(st.executeUpdate(sqlQuery));

			ResultSet rs = st.executeQuery(sqlQuery);
			System.out.println("EID\tENAME\tECITY\tSAL");
			System.out.println("--------------------------------------");
			while (rs.next()) {
				flag = true;
				// System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getString("city")+"\t"+rs.getFloat("sal"));
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) /*+ "\t" + rs.getFloat(4)*/);
			}
			if (flag == false) {
				System.out.println("No Records found");
			}
		}
	}
}
