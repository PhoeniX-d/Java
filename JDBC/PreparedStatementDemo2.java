import java.sql.*;
import java.util.*;

public class PreparedStatementDemo2
{
	public static void main(String[] args) throws Exception
	{
		String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		String DRIVER = "oracle.jdbc.OracleDriver";
		String USER = "xe";
		String PWD = "xe";
		String SQL_QUERY = "insert into employee values(?, ?, ?, ?)";
        Class.forName(DRIVER);

        /* try with resources */
		try(Connection con = DriverManager.getConnection(URL, USER, PWD);
			Scanner sc = new Scanner(System.in))
		{
            PreparedStatement pst = con.prepareStatement(SQL_QUERY);
            while(true)
			{
				System.out.print("Employee ID\t: ");
				int eid = sc.nextInt();
				System.out.print("Empoyee Name\t: ");
				String ename = sc.next();
				System.out.print("Address\t: ");
				String eaddr = sc.next();
				System.out.print("Employee Salary\t: ");
				float esal = sc.nextFloat();
                pst.setInt(1, eid);
                pst.setString(2, ename);
                pst.setString(3, eaddr);
                pst.setFloat(4, esal);
				pst.executeUpdate();
                System.out.println("Record Inserted successfully");
				System.out.println("Do u want to insert one more record[y/n]");
				String opt = sc.next();
				if(opt.equalsIgnoreCase("n"))
					break;
			}
		}			
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
