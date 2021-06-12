import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.util.Properties;

class DatabaseMetaDataDemo1 {
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
    System.out.println("Database Product Name\t:"+ dbmd.getDatabaseProductName());
    System.out.println("DatabaseProductVersion\t:"+ dbmd.getDatabaseProductVersion());
    System.out.println("DatabaseMajorVersion\t:"+ dbmd.getDatabaseMajorVersion());
    System.out.println("DatabaseMinorVersion\t:"+ dbmd.getDatabaseMinorVersion());
    System.out.println("JDBCMajorVersion\t:"+ dbmd.getJDBCMajorVersion());
    System.out.println("JDBCMinorVersion\t:"+ dbmd.getJDBCMinorVersion());
    System.out.println("DriverName\t\t:"+ dbmd.getDriverName());
    System.out.println("DriverVersion\t\t:"+ dbmd.getDriverVersion());
    System.out.println("URL\t\t\t:"+ dbmd.getURL());
    System.out.println("UserName\t\t:"+ dbmd.getUserName());
    System.out.println("MaxColumnsInTable\t:"+ dbmd.getMaxColumnsInTable());
    System.out.println("MaxRowSize\t\t:"+ dbmd.getMaxRowSize());
    System.out.println("MaxStatementLength\t:"+ dbmd.getMaxStatementLength());
    System.out.println("MaxTablesInSelect\t"+ dbmd.getMaxTablesInSelect());
    System.out.println("MaxTableNameLength\t:"+ dbmd.getMaxTableNameLength());
    System.out.println("SQLKeywords\t\t:"+ dbmd.getSQLKeywords());
    System.out.println("NumericFunctions\t:"+ dbmd.getNumericFunctions());
    System.out.println("StringFunctions\t:"+ dbmd.getStringFunctions());
    System.out.println("SystemFunctions\t:"+ dbmd.getSystemFunctions());
    System.out.println("supportsFullOuterJoins\t:"+ dbmd.supportsFullOuterJoins());
    System.out.println("supportsStoredProcedures\t:"+ dbmd.supportsStoredProcedures());
    con.close();
 }
}