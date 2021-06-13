import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetTypeTest {
	public static void main(String[] args) throws Exception {

		 java.util.Properties p = new java.util.Properties(); java.io.FileInputStream
		 fis = new java.io.FileInputStream(".\\..\\..\\db.properties"); p.load(fis);
		 String jdbcUrl = p.getProperty("OracleURL"); String user =
		 p.getProperty("OracleUser"); String pwd = p.getProperty("OraclePwd");
		 
		/*
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
		p.load(fis);
		String jdbcUrl = p.getProperty("MysqlURL");
		String user = p.getProperty("MysqlUser");
		String pwd = p.getProperty("MysqlPwd");
		*/
        
		try (Connection con = DriverManager.getConnection(jdbcUrl, user, pwd)) {
			DatabaseMetaData dbmd = con.getMetaData();
            System.out.println(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY));
            System.out.println(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE));
            System.out.println(dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY));
            System.out.println(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));           
		}
        catch(SQLException e)
        {
            e.printStackTrace();
        }
	}
}

