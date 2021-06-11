import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TransactionDemo2 {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);
        String jdbcUrl = p.getProperty("OracleURL");     
        String user = p.getProperty("OracleUser");     
        String pwd = p.getProperty("OraclePwd");
        
        try(Connection con = DriverManager.getConnection(jdbcUrl, user, pwd))
        {
            System.out.println(con.getTransactionIsolation());
            con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            System.out.println(con.getTransactionIsolation());
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
