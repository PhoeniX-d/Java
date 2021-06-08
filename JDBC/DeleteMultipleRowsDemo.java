import java.sql.*;
import java.util.Scanner;

public class DeleteMultipleRowsDemo
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
        
        try(Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Scanner sc = new Scanner(System.in))
		{
			Statement st = con.createStatement();
			System.out.print("Enter CutOff Amount\t:");
			float cutoff = sc.nextFloat();
			String SQL_QUERY = String.format("delete from employee where sal > %f", cutoff);
			int updateCount = st.executeUpdate(SQL_QUERY);
			System.out.println("The Number of Rows updated :" + updateCount);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
