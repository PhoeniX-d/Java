import java.sql.*;
import java.io.*;
public class BLOBDemo1 {
    public static void main(String[] args) {
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd))
        {
            PreparedStatement pst = con.prepareStatement("insert into wallpapers values(?, ?)");
            pst.setString(1, "Krishna");
            File f = new File("D:\\ComputerData\\Images\\Kurukshetra.jpg");
            FileInputStream fis = new FileInputStream(f);
            pst.setBinaryStream(2, fis);
            System.out.println("Image inserting from\t:" + f.getAbsolutePath());
            if(pst.executeUpdate() == 0)
                System.out.println("Record Not inserted");
            else
                System.out.println("Record inserted");           
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
