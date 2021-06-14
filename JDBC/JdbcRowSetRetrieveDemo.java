import java.io.FileInputStream;
import java.util.Properties;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetRetrieveDemo {
    public static void main(String[] args) throws Exception{
        RowSetFactory rsf = RowSetProvider.newFactory();
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);
        JdbcRowSet jrs = rsf.createJdbcRowSet();
        jrs.setUrl(p.getProperty("MysqlURL"));
        jrs.setUsername(p.getProperty("MysqlUser"));
        jrs.setPassword(p.getProperty("MysqlPwd"));
        jrs.setCommand("select * from employees");
        jrs.execute();
        System.out.println("\nEmployee Details in Forward Direction");
        System.out.println("Eid\tEname\tEsal\tEaddr");
        System.out.println("--------------------------------------------");
        while(jrs.next())
        {
            System.out.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getFloat(3) + "\t" + jrs.getString(4));
        }

        System.out.println("\nEmployee Details in Backward Direction");
        System.out.println("Eid\tEname\tEsal\tEaddr");
        System.out.println("--------------------------------------------");
        while(jrs.previous())
        {
            System.out.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getFloat(3) + "\t" + jrs.getString(4));
        }
        
        System.out.println("\nAccessing Randomly");
        jrs.absolute(3);
        System.out.println(jrs.getRow() + "---->" + jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getFloat(3) + "\t" + jrs.getString(4));

        jrs.first();
        System.out.println(jrs.getRow() + "---->" + jrs.getInt(1) + " \t" + jrs.getString(2) + "\t" + jrs.getFloat(3) + "\t" + jrs.getString(4));

        jrs.last();
        System.out.println(jrs.getRow() + "---->" + jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getFloat(3) + "\t" + jrs.getString(4));
    }
}
