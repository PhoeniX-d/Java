import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class WebRowSetInsertDemo {
    public static void main(String[] args)throws Exception {
        RowSetFactory rsf = RowSetProvider.newFactory();
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);
        WebRowSet wrs = rsf.createWebRowSet();
        String jdbcUrl = p.getProperty("MysqlURL");
        String user = p.getProperty("MysqlUser");
        String pwd = p.getProperty("MysqlPwd");
        Connection con = DriverManager.getConnection(jdbcUrl, user, pwd);
        Statement st = con.createStatement();       
        ResultSet rs = st.executeQuery("select * from employees");
        wrs.populate(rs);
        con.setAutoCommit(false);
        FileReader fr = new FileReader("emp.xml");
        wrs.readXml(fr);
        wrs.acceptChanges(con);
        System.out.println("Employee Data transfered to database from emp.xml file");
        fr.close();
        con.close();
        wrs.close();
    }
}
