import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetDeleteDemo {
    public static void main(String[] args) throws Exception{
        RowSetFactory rsf = RowSetProvider.newFactory();
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);
        CachedRowSet crs = rsf.createCachedRowSet();
        String jdbcUrl = p.getProperty("MysqlURL");
        String user = p.getProperty("MysqlUser");
        String pwd = p.getProperty("MysqlPwd");
        Connection con = DriverManager.getConnection(jdbcUrl, user, pwd);
        Statement st = con.createStatement();       
        ResultSet rs = st.executeQuery("select * from employees");
        crs.populate(rs);
        con.setAutoCommit(false);
        while(crs.next())
        {
            float esal = crs.getFloat(3);
            if(esal <= 9000)
            {
                crs.deleteRow();
            }
        }
        crs.moveToCurrentRow();
        crs.acceptChanges(con);
        crs.close();
        System.out.println("Records Deleted Successfully");
    }
}
