/*
Stored procedure:
===================
create or replace function getAllEmpInfo(eid1 IN number, eid2 IN number) return SYS_REFCURSOR as
emps SYS_REFCURSOR;
BEGIN
    open emps for select * from employee where eid >= eid1 and eid <= eid2;
    return emps;
END;
/
*/

import java.sql.*;
import oracle.jdbc.*;   /* for OracleTyes.CURSOR and it is present in ojdbc6.jar */
import java.util.Scanner;
public class StoredProcedureDemoF8
{
    public static void main(String[] args) {
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd);
        Scanner sc = new Scanner(System.in))
        {
            CallableStatement cst = con.prepareCall("{ ?= call getAllEmpInfo(?, ?)}");
            System.out.print("Enter the eid of employee 1\t:");
            int id1 = sc.nextInt();
            System.out.print("Enter the eid of employee 2\t:");
            int id2 = sc.nextInt();
            cst.setInt(2, id1);
            cst.setInt(3, id2);
            cst.registerOutParameter(1, OracleTypes.CURSOR);
            //try{
                cst.execute();
            //}
            //catch(SQLException e)
            //{
            //    System.out.println("No record found !!");
                //System.exit(0);
            //}
            ResultSet rs = (ResultSet)cst.getObject(1);
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
