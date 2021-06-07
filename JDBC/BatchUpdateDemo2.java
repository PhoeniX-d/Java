/* 
Batch Updates -
Advantages of Batch Updates:
1. Network traffic will be reduced
2. Performance will be improved
Limitations of Batch updates:
1. We can use Batch Updates concept only for non-select queries. If we are trying to use for select
queries then we will get RE saying BatchUpdateException.
2. In batch if one sql query execution fails then remaining sql queries wont be executed.
*/

import java.sql.*;
import java.util.Scanner;
public class BatchUpdateDemo2 {
    public static void main(String[] args){
        try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "xe", "xe");
        Scanner sc = new Scanner(System.in))
        {
            PreparedStatement pst = con.prepareStatement("insert into employee values(?, ?, ?, ?)");
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
				pst.addBatch();
				System.out.println("Do u want to insert one more record[y/n]");
				String opt = sc.next();
				if(opt.equalsIgnoreCase("n"))
					break;
			}
            pst.executeBatch();
            System.out.println("Record Inserted successfully");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }    
}
