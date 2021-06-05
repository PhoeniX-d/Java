import java.sql.*;

public class DeleteSingleRowDemo
{
	public static void main(String[] args) throws Exception
	{
		String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		//String DRIVER = "oracle.jdbc.OracleDriver";
		String USER = "xe";
		String PWD = "xe";
		String SQL_QUERY = "delete employee where eid=6";

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
