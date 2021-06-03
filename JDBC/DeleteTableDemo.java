import java.sql.*;

public class DeleteTableDemo
{
	public static void main(String[] args) throws Exception
	{
		String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		String DRIVER = "oracle.jdbc.OracleDriver";
		String USER = "xe";
		String PWD = "xe";
		String SQL_QUERY = "drop table player";

		try(Connection con = DriverManager.getConnection(URL, USER, PWD))
		{
			Statement st = con.createStatement();
			st.executeUpdate(SQL_QUERY);
			System.out.println("Table Deleted Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
