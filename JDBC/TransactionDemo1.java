import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;


public class TransactionDemo1 {
    public static void main(String[] args)throws Exception {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);
        String jdbc_url = p.getProperty("OracleURL");
        String user = p.getProperty("OracleUser");
        String pwd = p.getProperty("OraclePwd");

        try(Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
        Scanner sc = new Scanner(System.in))
        {
            Statement st = con.createStatement();
            System.out.println("Data before Transaction");
            System.out.println("=========================\n");
            ResultSet rs = st.executeQuery("select * from accounts");
            while(rs.next())
            {
                System.out.println(rs.getString(1) + "\t" + rs.getFloat(2));
            }
            System.out.println("\nTransaction Begins......");
            con.setAutoCommit(false);
            st.executeUpdate("update accounts set bal = bal - 10000 where name = 'Karl'");
            st.executeUpdate("update accounts set bal = bal + 10000 where name  = 'Sally'");
            System.out.println("Do you confirm transaction of 10000?[Y/N]");
            char option = sc.next().charAt(0);
            if(option == 'y' || option == 'Y')
            {
                con.commit();
                System.out.println("\nTransaction Committed");
            }
            else
            {
                con.rollback();
                System.out.println("\nTransaction Rolled back");
            }
            System.out.println("\nData after Transaction");
            System.out.println("=========================\n");
            ResultSet rs1 = st.executeQuery("select * from accounts");
            while(rs1.next())
            {
                System.out.println(rs1.getString(1) + "\t" + rs1.getFloat(2));
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
