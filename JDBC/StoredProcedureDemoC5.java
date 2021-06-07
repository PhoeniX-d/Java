/*
Stored procedure:
===================
create or replace procedure getEmpInfoBySal(salary IN number, emps OUT SYS_REFCURSOR) as
begin
    open emps for select * from employee where esal > salary;
end;
/
*/

import java.sql.*;
import oracle.jdbc.*;   /* for OracleTyes.CURSOR and it is present in ojdbc6.jar */
import java.util.Scanner;
public class StoredProcedureDemoC5
{
    public static void main(String[] args) {
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd);
        Scanner sc = new Scanner(System.in))
        {
            CallableStatement cst = con.prepareCall("{call getEmpInfoBySal(?, ?)}");
            System.out.print("Enter the salary of employee\t:");
            float sal = sc.nextFloat();
            cst.setFloat(1, sal);
            cst.registerOutParameter(2, OracleTypes.CURSOR);
            cst.execute();
            ResultSet rs = (ResultSet)cst.getObject(2);
            boolean bflag = false;
            System.out.println("EID\tENAME\tECITY\tSAL");
			System.out.println("--------------------------------------");
            while(rs.next())
            {
                bflag = true;
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4));
            }
            if(bflag == false)
            {
                System.out.println("Records not available !!");
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
