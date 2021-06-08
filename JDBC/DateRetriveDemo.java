import java.sql.*;
import java.text.*;

public class DateRetriveDemo {
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
            PreparedStatement pst = con.prepareStatement("select * from users order by doj desc");
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            ResultSet rs = pst.executeQuery();
            System.out.println("NAME\t |     DOJ");
            System.out.println("---------+-----------");
            boolean flag = false;
            while(rs.next())
            {
                flag = true;
                String name = rs.getString(1);
                java.sql.Date sdate = rs.getDate(2);
                String date = sdf.format(sdate);
                System.out.println(name + "\t | " + date);
            }
            if(flag ==false)
                System.out.println("No record found!!");
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
