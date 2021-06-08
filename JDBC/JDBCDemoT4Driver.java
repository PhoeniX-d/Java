import java.sql.*;

public class JDBCDemoT4Driver {
    public static void main(String[] args) throws Exception {

        /* Optional */
        /* Class.forName("oracle.jdbc.OracleDriver"); */

        /* Type 4 Driver URL */
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
            /* Type 4 Driver URL */
            // System.out.println(con.getClass().getName());

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
