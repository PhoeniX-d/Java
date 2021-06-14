import java.io.FileInputStream;
import java.util.Properties;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetRetrieveDemo {
    public static void main(String[] args) throws Exception{
        RowSetFactory rsf = RowSetProvider.newFactory();
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);

        CachedRowSet crs = rsf.createCachedRowSet();
        // setting properties
        crs.setUrl(p.getProperty("MysqlURL"));
        crs.setUsername(p.getProperty("MysqlUser"));
        crs.setPassword(p.getProperty("MysqlPwd"));
        crs.setCommand("select * from employees");
        crs.execute();
        System.out.println("\nEmployee Details in Forward Direction");
        System.out.println("Eid\tEname\tEsal\tEaddr");
        System.out.println("--------------------------------------------");
        while(crs.next())
        {
            System.out.println(crs.getInt(1) + "\t" + crs.getString(2) + "\t" + crs.getFloat(3) + "\t" + crs.getString(4));
        }

        System.out.println("\nEmployee Details in Backward Direction");
        System.out.println("Eid\tEname\tEsal\tEaddr");
        System.out.println("--------------------------------------------");
        while(crs.previous())
        {
            System.out.println(crs.getInt(1) + "\t" + crs.getString(2) + "\t" + crs.getFloat(3) + "\t" + crs.getString(4));
        }
    }
}
