import java.io.FileInputStream;
import java.util.Properties;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetUpdateDemo {
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
        System.out.println("Deduction in salary.......");
        while(jrs.next())
        {
            float esal = jrs.getFloat(3);
            if(esal > 10000)
            {
                float new_sal = esal - 1500;
                jrs.updateFloat(3, new_sal);
                jrs.updateRow();
            }
        }
        System.out.println("Records Updated Successfully");
        jrs.close();
    }
}
