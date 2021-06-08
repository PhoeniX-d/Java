import java.sql.*;
import java.io.*;

public class CLOBDemo1 {
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
        try (Connection con = DriverManager.getConnection(jdbc_url, user, pwd)) {
            PreparedStatement pst = con.prepareStatement("insert into codes values(?, ?)");
            pst.setString(1, "jdbcnote");
            File f = new File("JDBCImp.txt");
            FileReader fr = new FileReader(f);
            pst.setCharacterStream(2, fr);
            System.out.println("File inserting from\t:" + f.getAbsolutePath());
            if (pst.executeUpdate() == 0)
                System.out.println("Record Not inserted");
            else
                System.out.println("Record inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
