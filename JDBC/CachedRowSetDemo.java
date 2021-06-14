import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetDemo {
    public static void main(String[] args) throws Exception{
        RowSetFactory rsf = RowSetProvider.newFactory();
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);
        String jdbcUrl = p.getProperty("MysqlURL");
        String user = p.getProperty("MysqlUser");
        String pwd = p.getProperty("MysqlPwd");
        Connection con = DriverManager.getConnection(jdbcUrl, user, pwd);
        Statement st = con.createStatement();       
        ResultSet rs = st.executeQuery("select * from employees");
        CachedRowSet crs = rsf.createCachedRowSet();
        crs.populate(rs);
        /*
        crs.setUrl(p.getProperty("MysqlURL"));
        crs.setUsername(p.getProperty("MysqlUser"));
        crs.setPassword(p.getProperty("MysqlPwd"));
        */
        con.close();
        /*
        Now we cannot access ResultSet after connection closed but we can access CachedRowSet
        */
        //if(rs.next()){} // Exception in thread "main" java.sql.SQLException: Operation not allowed after ResultSet closed

        System.out.println("Eid\tEname\tEsal\tEaddr");
        System.out.println("--------------------------------------------");
        while(crs.next())
        {
            System.out.println(crs.getInt(1) + "\t" + crs.getString(2) + "\t" + crs.getFloat(3) + "\t" + crs.getString(4));
        }
    }
}
