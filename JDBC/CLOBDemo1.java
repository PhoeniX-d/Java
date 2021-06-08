import java.sql.*;
import java.io.*;
public class CLOBDemo1 {
    public static void main(String[] args) {
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd))
        {
            PreparedStatement pst = con.prepareStatement("insert into codes values(?, ?)");
            pst.setString(1, "jdbcnote");
            File f = new File("JDBCImp.txt");
            FileReader fr = new FileReader(f);
            pst.setCharacterStream(2, fr);
            System.out.println("File inserting from\t:" + f.getAbsolutePath());
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
