import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetUpdateDemo {
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
        System.out.println("Promotion in salary.......");
        while(crs.next())
        {
            float esal = crs.getFloat(3);
            if(esal > 10000)
            {
                float new_sal = esal - 1500;
                crs.updateFloat(3, new_sal);
                crs.updateRow();
            }
        }
        crs.acceptChanges(con);
        System.out.println("Records Updated Successfully");
        crs.close();
    }
}
