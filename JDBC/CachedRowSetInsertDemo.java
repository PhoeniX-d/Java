import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetInsertDemo {
    public static void main(String[] args) throws Exception{
        RowSetFactory rsf = RowSetProvider.newFactory();
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);
        CachedRowSet crs = rsf.createCachedRowSet();
        crs.setUrl("jdbc:mysql://localhost:3306/jdbcdb?relaxAutoCommit=true");
        crs.setUsername(p.getProperty("MysqlUser"));
        crs.setPassword(p.getProperty("MysqlPwd"));
        crs.setCommand("select * from employees");
        crs.execute();
        Scanner sc = new Scanner(System.in);
        /*
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
        */
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

            crs.moveToInsertRow();
            crs.updateInt(1, eid);
            crs.updateString(2, ename);
            crs.updateFloat(3, esal);
            crs.updateString(4, eaddr);
            crs.insertRow();

            System.out.println("Employee record inserted successfully..");
            System.out.println("Do you want to add more records[yes/no]");
            String opt = sc.next();
            if(opt.equalsIgnoreCase("No"))
                break;
        }
        crs.moveToCurrentRow();
        crs.acceptChanges();
        sc.close();
        crs.close();
    }
}
