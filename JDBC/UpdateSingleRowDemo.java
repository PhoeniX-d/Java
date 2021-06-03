import java.sql.*;

public class UpdateSingleRowDemo
{
	public static void main(String[] args) throws Exception
	{
		String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		String DRIVER = "oracle.jdbc.OracleDriver";
		String USER = "xe";
		String PWD = "xe";
		String SQL_QUERY = "update player set pcity = 'Mumbai' where pname = 'Kohli'";

		try(Connection con = DriverManager.getConnection(URL, USER, PWD))
		{
			Statement st = con.createStatement();
			int updateCount = st.executeUpdate(SQL_QUERY);
			System.out.println("The Number of Rows updated :" + updateCount);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
