import java.sql.*;
import java.io.*;
public class CLOBDemo2 {
    public static void main(String[] args) {
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd))
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
