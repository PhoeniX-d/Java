import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;

class ResultSetMetadataDemo1 {
public static void main(String[] args) throws Exception
{
    
    Properties p = new Properties();
    FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
    p.load(fis);
    String jdbcUrl = p.getProperty("OracleURL");     
    String user = p.getProperty("OracleUser");     
    String pwd = p.getProperty("OraclePwd");
    
    /*
    Properties p = new Properties();
    FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
    p.load(fis);
    String jdbcUrl = p.getProperty("MysqlURL");     
    String user = p.getProperty("MysqlUser");     
    String pwd = p.getProperty("MysqlPwd");
    */

    Connection con = DriverManager.getConnection(jdbcUrl, user, pwd);
    int count = 0;
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("Select * from employee");
    ResultSetMetaData rsmd = rs.getMetaData();
    count = rsmd.getColumnCount();
    for(int i = 1; i <= count; i++)
    {
        System.out.println("Column Number\t:" + i);
        System.out.println("Column Name\t:" + rsmd.getColumnName(i));
        System.out.println("Column Type\t:" + rsmd.getColumnType(i));
        System.out.println("Column Size\t:" + rsmd.getColumnDisplaySize(i));
        System.out.println("------------------------");
    }
    con.close();
 }
}