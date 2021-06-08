import java.util.*;
import java.sql.*;

public class DateInsertDemo2 {
    public static void main(String[] args) {
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
            System.out.print("Enter person name\t:");
            String name = sc.next();
            System.out.print("Enter DOJ(yyyy-MM-dd)\t:");
            String doj = sc.next();

            java.sql.Date sdate = java.sql.Date.valueOf(doj);
            String query = "insert into users values(?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setDate(2, sdate);
            int rc = pst.executeUpdate();
            if (rc == 0) {
                System.out.println("Record not inserted");
            } else {
                System.out.println("Record inserted");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
