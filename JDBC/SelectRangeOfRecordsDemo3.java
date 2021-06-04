import java.sql.*;
import java.util.Scanner;

public class SelectRangeOfRecordsDemo2
	{
	public static void main(String[] args) throws Exception
	{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="xe";
		String pwd="xe";
		
		try(Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
			Scanner sc = new Scanner(System.in))
		{
			Statement st = con.createStatement();
			System.out.print("Enter the Initials of employee name\t:");
			String initials = sc.next() + "%";
			String sqlQuery=String.format("select * from employee where ename like '%s'", initials);
			boolean flag= false;
			ResultSet rs =st.executeQuery(sqlQuery);
			System.out.println("EID\tENAME\tCITY\tSAL");
			System.out.println("--------------------------------------");
			while(rs.next())
			{
				flag = true;
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4));
			}
			if(flag == false)
			{
				System.out.println("No Records found");
			}
		}		
	}
}
