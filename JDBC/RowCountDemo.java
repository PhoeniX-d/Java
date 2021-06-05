import java.util.Scanner;
import java.sql.*;

public class RowCountDemo
{
	public static void main(String[] args)throws SQLException
	{
		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "xe";
		String pwd = "xe";
		String sql_query = "select count(*) from employee";
		try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd))
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql_query);
			if(rs.next())
			{
				System.out.print("Total Number of Rows present are\t:" + rs.getInt(1));
			}
		}
	}
}