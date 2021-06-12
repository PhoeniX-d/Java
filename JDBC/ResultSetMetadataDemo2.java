import java.sql.*;

public class ResultSetMetadataDemo2 {
	public static void main(String[] args) throws Exception {
		java.util.Properties p = new java.util.Properties();
		java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
		p.load(fis);
		String jdbc_url = p.getProperty("OracleURL");
		String user = p.getProperty("OracleUser");
		String pwd = p.getProperty("OraclePwd");

		/*
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
		p.load(fis);
		String jdbcUrl = p.getProperty("MysqlURL");     
		String user = p.getProperty("MysqlUser");     
		String pwd = p.getProperty("MysqlPwd");
   		*/

		try (Connection con = DriverManager.getConnection(jdbc_url, user, pwd)) {
			Statement st = con.createStatement();
			String sqlQuery = "select * from employee";
			boolean flag = false;
			ResultSet rs = st.executeQuery(sqlQuery);
			ResultSetMetaData rsmd = rs.getMetaData();
            String col1 = rsmd.getColumnName(1);
            String col2 = rsmd.getColumnName(2);
            String col3 = rsmd.getColumnName(3);
            String col4 = rsmd.getColumnName(4);
            System.out.println(col1 + "\t" + col2 + "\t" + col3 + "\t" + col4);
			System.out.println("--------------------------------------");
			while (rs.next()) {
				flag = true;
				// System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getString("city")+"\t"+rs.getFloat("sal"));
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
			}
			if (flag == false) {
				System.out.println("No Records found");
			}
		}
	}
}
