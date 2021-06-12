import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

class DatabaseMetaDataDemo2 {
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
    DatabaseMetaData dbmd = con.getMetaData();
    int count = 0;
    String catalog = null;
    String schemaPattern = null;
    String tableNamePattern = null;
    String []types = null;
    ResultSet rs = dbmd.getTables(catalog, schemaPattern, tableNamePattern, types);
    while(rs.next())
    {
        count++;
        System.out.println(rs.getString(3));
    }
    System.out.println("The number of tables\t:" + count);
    con.close();
 }
}