import java.sql.*;
import java.util.Scanner;

public class SQLInjectionDemo1
{
    public static void main(String[] args) {
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd);
            Scanner sc = new Scanner(System.in))
        {
            Statement st = con.createStatement();
            System.out.print("Enter username\t:");
            String uname = sc.next();
            System.out.print("Enter password\t:");
            String upwd = sc.next();
            String sqlquery = "select count(*) from users where uname='" + uname + "' and pwd='" + upwd + "'";
            ResultSet rs = st.executeQuery(sqlquery);
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
