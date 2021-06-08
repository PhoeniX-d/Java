import java.sql.*;
import java.util.Scanner;

public class SelectRangeOfRecordsDemo3 {
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

		try (Connection con = DriverManager.getConnection(jdbc_url, user, pwd); Scanner sc = new Scanner(System.in)) {
			Statement st = con.createStatement();
			System.out.print("Enter the Initials of employee name\t:");
			String initials = sc.next() + "%";
			String sqlQuery = String.format("select * from employee where ename like '%s'", initials);
			boolean flag = false;
			ResultSet rs = st.executeQuery(sqlQuery);
			System.out.println("EID\tENAME\tCITY\tSAL");
			System.out.println("--------------------------------------");
			while (rs.next()) {
				flag = true;
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
			}
			if (flag == false) {
				System.out.println("No Records found");
			}
		}
	}
}
