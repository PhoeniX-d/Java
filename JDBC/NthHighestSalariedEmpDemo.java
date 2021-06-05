import java.util.Scanner;
import java.sql.*;

public class NthHighestSalriedEmpDemo
{
	public static void main(String[] args)throws SQLException
	{
		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "xe";
		String pwd = "xe";
		
		try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd);
			Scanner sc = new Scanner(System.in))
		{
			Statement st = con.createStatement();
			System.out.print("Enter the number\t:");
			int n = sc.nextInt();
			String sql_query = "select * from (select eid, ename, sal, city, rank() over (order by sal DESC) ranking from employee) where ranking="+n;
			ResultSet rs = st.executeQuery(sql_query);
			if(rs.next())
			{
				System.out.println("\nHighest Salaried Employee Information");
				System.out.println("EID\tENAME\tCITY\tSAL");
				System.out.println("----------------------------------------------------------------------");
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
			}
		}
	}
}