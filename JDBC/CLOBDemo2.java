import java.sql.*;
import java.io.*;
public class CLOBDemo2 {
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
        try(Connection con = DriverManager.getConnection(jdbc_url, user, pwd);)
        {
            PreparedStatement pst = con.prepareStatement("select * from codes");
            File f = new File("JDBCImp_new.txt");
            FileWriter fw = new FileWriter(f);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                String name = rs.getString(1);
                System.out.println("Name from database\t: " + name);
                Reader r = rs.getCharacterStream(2);
                char[] buffer = new char[1024];
                while(r.read(buffer) > 0)
                {
                    fw.write(buffer);
                }
                System.out.println("Image is available at\t: " + f.getAbsolutePath());
                fw.flush();
                fw.close();
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
