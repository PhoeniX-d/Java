import java.sql.*;
import javax.sql.*;
import com.mysql.cj.jdbc.*;
public class ConnectionPoolMysqlDemo
	{
	public static void main(String[] args) throws Exception
	{
		java.util.Properties p = new java.util.Properties();		
		try
        {
            java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
            p.load(fis);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		String jdbc_url = p.getProperty("MysqlURL");
		String user = p.getProperty("MysqlUser");
		String pwd = p.getProperty("MysqlPwd");

        MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();

        ds.setURL(jdbc_url);
        ds.setUser(user);
        ds.setPassword(pwd);

		
		try(Connection con = ds.getConnection())
		{
			Statement st = con.createStatement();
			String sqlQuery="select * from employees";
			boolean flag= false;			
			ResultSet rs = st.executeQuery(sqlQuery);
			System.out.println("ENO\tENAME\t ESAL\tEADDR");
			System.out.println("-------------------------------------------------");
			while(rs.next())
			{
				flag = true;
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
			}
			if(flag == false)
			{
				System.out.println("No Records found");
			}
		}		
	}
}
