import java.util.Scanner;
import java.sql.*;

public class SelectNonSelectDemo
{
	public static void main(String[] args)throws SQLException
	{
		java.util.Properties p = new java.util.Properties();		
		try
        {
            java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
            p.load(fis);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		String jdbc_url = p.getProperty("OracleURL");
		String user = p.getProperty("OracleUser");
		String pwd = p.getProperty("OraclePwd");
        
        try(Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
			Scanner sc = new Scanner(System.in))
		{
			Statement st = con.createStatement();
			System.out.print("Enter the query\t:");
			String sql_query = sc.nextLine();
			boolean b = st.execute(sql_query);
			if(b == true)	/* Select query */
			{
				ResultSet rs = st.getResultSet();
				System.out.println("EID\t\tENAME\t\tCITY\t\tSAL");
				System.out.println("----------------------------------------------------------------------");
				while(rs.next())
				{
					System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3)  + "\t\t" + rs.getFloat(4));
				}
			}
			else 	/* Non select query */
			{
				int n = st.getUpdateCount();
				System.out.println("The number of records affected\t:" + n);
			}			
		}
	}
}
