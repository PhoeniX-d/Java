import java.sql.*;

public class ResultSetTypeDemo1 {
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
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sqlQuery = "select * from employee";
			boolean flag = false;
			ResultSet rs = st.executeQuery(sqlQuery);
			System.out.println("Forward Direction:");
			System.out.println("EID\tENAME\tECITY\tSAL");
			System.out.println("--------------------------------------");
			while (rs.next()) {
				flag = true;
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
			}
			if (flag == false) {
				System.out.println("No Records found");
                return;
			}

            //rs.afterLast(); // Directly goes to After Last Record

			System.out.println("\nBackward Direction:");
            System.out.println("EID\tENAME\tECITY\tSAL");
			System.out.println("--------------------------------------");
            while (rs.previous()) {
                flag = true;
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
			}
            if (flag == false) {
				System.out.println("No Records found");
                return;
			}
		}
	}
}
