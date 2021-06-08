import java.sql.*;
import java.io.*;
public class BLOBDemo2 {
    public static void main(String[] args) {
        java.util.Properties p = new java.util.Properties();		
		try
        {
            java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
            p.load(fis);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		String jdbc_url = p.getProperty("OracleURL");
		String user = p.getProperty("OracleUser");
		String pwd = p.getProperty("OraclePwd");
        try(Connection con = DriverManager.getConnection(jdbc_url, user, pwd))
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
