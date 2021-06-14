import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetInsertDemo {
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
        Scanner sc = new Scanner(System.in);
        jrs.moveToInsertRow();
        while(true)
        {
            System.out.print("Employee Id\t:");
            int eid = sc.nextInt();
            System.out.print("Employee Name\t:");
            String ename = sc.next();
            System.out.print("Employee Salary\t:");
            float esal = sc.nextFloat();            
            System.out.print("Employee City\t:");
            String eaddr = sc.next();

            jrs.updateInt(1, eid);
            jrs.updateString(2, ename);
            jrs.updateFloat(3, esal);
            jrs.updateString(4, eaddr);
            jrs.insertRow();
            System.in.read();
            System.out.println("Employee record inserted successfully..");
            System.out.println("Do you want to add more records[yes/no]");
            String opt = sc.next();
            if(opt.equalsIgnoreCase("No"))
                break;
        }
        sc.close();
        jrs.close();
    }
}
