import java.sql.*;
import java.io.*;
public class BLOBDemo2 {
    public static void main(String[] args) {
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd))
        {
            PreparedStatement pst = con.prepareStatement("select * from wallpapers");
            File f = new File("D:\\ComputerData\\Images\\Kurukshetra_new.jpg");
            FileOutputStream fos = new FileOutputStream(f);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                String name = rs.getString(1);
                System.out.println("Name from database\t: " + name);
                InputStream is = rs.getBinaryStream(2);
                byte[] buffer = new byte[2048];
                while(is.read(buffer) > 0)
                {
                    fos.write(buffer);
                }
                fos.flush();
                System.out.println("Image is available at\t: " + f.getAbsolutePath());
                fos.close();
            }
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
