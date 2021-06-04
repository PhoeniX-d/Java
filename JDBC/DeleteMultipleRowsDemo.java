import java.sql.*;
import java.util.Scanner;

public class UpdateMultiplesRowsDemo
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
