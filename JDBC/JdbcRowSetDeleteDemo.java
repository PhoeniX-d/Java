import java.io.FileInputStream;
import java.util.Properties;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetDeleteDemo {
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
        while(jrs.next())
        {
            float esal = jrs.getFloat(3);
            if(esal < 5000)
            {
                jrs.deleteRow();
            }
        }
        System.out.println("Records Deleted Successfully");
        jrs.close();
    }
}
