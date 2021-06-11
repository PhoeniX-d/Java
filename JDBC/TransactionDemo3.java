import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TransactionDemo3 {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);
        String jdbcUrl = p.getProperty("MysqlURL");     
        String user = p.getProperty("MysqlUser");     
        String pwd = p.getProperty("MysqlPwd");
        
        try(Connection con = DriverManager.getConnection(jdbcUrl, user, pwd))
        {
            System.out.println(con.getTransactionIsolation());
            con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            System.out.println(con.getTransactionIsolation());
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
