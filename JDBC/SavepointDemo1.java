import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;

public class SavepointDemo1 {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);
        String jdbcUrl = p.getProperty("OracleURL");     
        String user = p.getProperty("OracleUser");     
        String pwd = p.getProperty("OraclePwd");
        
        try(Connection con = DriverManager.getConnection(jdbcUrl, user, pwd))
        {
            Statement st = con.createStatement();
            con.setAutoCommit(false);
            st.executeUpdate("insert into accounts values('Clark', 50000)");
            st.executeUpdate("insert into accounts values('Bruce', 500000)");
            Savepoint sp = con.setSavepoint();
            st.executeUpdate("insert into accounts values('Tony', 1000000)");
            System.out.println("oops....wrong entry inserted just rollback");
            con.rollback(sp);
            //con.releaseSavepoint(sp);
            //System.out.println("Operations are rolled back from savepoint");
            con.commit();
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
