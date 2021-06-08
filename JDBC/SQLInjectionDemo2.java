import java.sql.*;
import java.util.Scanner;

public class SQLInjectionDemo2
{
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
        
        try(Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
            Scanner sc = new Scanner(System.in))
        {
            String sqlquery = "select count(*) from users where uname=? and pwd=?";
            PreparedStatement pst = con.prepareStatement(sqlquery);
            System.out.print("Enter username\t:");
            String uname = sc.next();
            System.out.print("Enter password\t:");
            String upwd = sc.next();
            pst.setString(1, uname);
            pst.setString(2, upwd);
            ResultSet rs = pst.executeQuery();
            int c = 0;
            if(rs.next())
            {
                c = rs.getInt(1);
            }
            if(c == 0)
                System.out.println("Invalid Credentials");
            else 
                System.out.println("Valid credentials");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
