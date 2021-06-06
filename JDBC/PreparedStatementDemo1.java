import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        String driver = "oracle.jdbc.OracleDriver";
        Class.forName(driver);
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        Connection con = DriverManager.getConnection(jdbcurl, user, pwd);
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
