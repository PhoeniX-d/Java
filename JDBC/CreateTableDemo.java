import java.sql.*;

public class CreateTableDemo
{
	public static void main(String[] args) throws Exception
	{
		String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		String DRIVER = "oracle.jdbc.OracleDriver";
		String USER = "xe";
		String PWD = "xe";
		String SQL_QUERY = "create table player(pid number, pname varchar2(20), pcity varchar2(20), pteam varchar2(15))";

		try(Connection con = DriverManager.getConnection(URL, USER, PWD))
		{
			Statement st = con.createStatement();
			st.executeUpdate(SQL_QUERY);
			System.out.println("Table Created Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
