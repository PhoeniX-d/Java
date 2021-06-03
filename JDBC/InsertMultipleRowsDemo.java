import java.sql.*;
import java.util.*;

public class InsertMultipleRowsDemo
{
	public static void main(String[] args) throws Exception
	{
		String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		String DRIVER = "oracle.jdbc.OracleDriver";
		String USER = "xe";
		String PWD = "xe";

		try(Connection con = DriverManager.getConnection(URL, USER, PWD);
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
