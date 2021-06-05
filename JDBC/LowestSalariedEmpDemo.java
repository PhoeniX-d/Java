import java.util.Scanner;
import java.sql.*;

public class LowestSalriedEmpDemo
{
	public static void main(String[] args)throws SQLException
	{
		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "xe";
		String pwd = "xe";
		String sql_query = "select * from employee where sal = (select min(sal) from employee)";
		try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd))
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql_query);
			if(rs.next())
			{
				System.out.println("\nLowest Salaried Employee Information");
				System.out.println("EID\tENAME\tCITY\tSAL");
				System.out.println("----------------------------------------------------------------------");
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
			}
		}
	}
}