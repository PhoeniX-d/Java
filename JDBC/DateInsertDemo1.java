import java.util.*;
import java.sql.*;
import java.text.*;

public class DateInsertDemo1 {
    public static void main(String[] args) {
        //String driver = "oracle.jdbc.OracleDriver";
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd);
        Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter person name\t:");
            String name = sc.next();
            System.out.print("Enter DOJ(dd-mm-yyyy)\t:");
            String doj = sc.next();

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date udate = sdf.parse(doj);
            long l = udate.getTime();
            java.sql.Date sdate = new java.sql.Date(l);
            String query = "insert into users values(?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setDate(2, sdate);
            int rc = pst.executeUpdate();
            if(rc == 0)
            {
                System.out.println("Record not inserted");
            }
            else
            {
                System.out.println("Record inserted");
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
