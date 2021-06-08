import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
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

        Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        String sqlQuery = "delete from employee where ename = ?";

        PreparedStatement pst = con.prepareStatement(sqlQuery);
        pst.setString(1, "Shiva");
        int updateCount = pst.executeUpdate();
        System.out.println("The number of rows deleted\t:" + updateCount);

        System.out.println("Reusing PreparedStatement to delete one more record");
        pst.setString(1, "Samarth");
        updateCount = pst.executeUpdate();
        System.out.println("The number of rows deleted\t:" + updateCount);
        con.close();
    }
}
