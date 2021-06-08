import java.sql.*;

public class CreateTableDemo
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
		String jdbc_url = p.getProperty("OracleURL");
		String user = p.getProperty("OracleUser");
		String pwd = p.getProperty("OraclePwd");
		String SQL_QUERY = "create table player(pid number, pname varchar2(20), pcity varchar2(20), pteam varchar2(15))";

	    try(Connection con = DriverManager.getConnection(jdbc_url, user, pwd))
		{
			Statement st = con.createStatement();
			System.out.println(st.executeUpdate(SQL_QUERY));
			System.out.println("Table Created Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
