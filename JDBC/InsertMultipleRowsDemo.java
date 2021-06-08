import java.sql.*;
import java.util.*;

public class InsertMultipleRowsDemo
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
			//Scanner sc = new Scanner(System.in);
			while(true)
			{
				System.out.print("Player ID\t: ");
				int pid = sc.nextInt();
				System.out.print("Player Name\t: ");
				String pname = sc.next();
				System.out.print("Address\t: ");
				String pcity = sc.next();
				System.out.print("Player Team\t: ");
				String team = sc.next();
				//System.out.println();
				String SQL_QUERY = String.format("insert into player values(%d, '%s', '%s', '%s')", pid, pname, pcity, team);
				st.executeUpdate(SQL_QUERY);
				System.out.println("Do u want to insert one more record[y/n]");
				String opt = sc.next();
				if(opt.equalsIgnoreCase("n"))
					break;
			}
			//sc.close();
		}			
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
