/*
Stored procedure:
===================
create or replace function getDeletedEmpInfo(id IN number, count OUT number) return SYS_REFCURSOR as
emps SYS_REFCURSOR;
BEGIN
    open emps for
        select * from employee where eid = id;
        delete from employee where eid = id;
        count := SQL%ROWCOUNT;
    return emps;
END;
/
*/

import java.sql.*;
import oracle.jdbc.*;   /* for OracleTyes.CURSOR and it is present in ojdbc6.jar */
import java.util.Scanner;
public class StoredProcedureDemoF9
{
    public static void main(String[] args) {
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
            CallableStatement cst = con.prepareCall("{ ?= call getDeletedEmpInfo(?, ?)}");
            System.out.print("Enter the eid of employee to be deleted\t:");
            int id1 = sc.nextInt();
            cst.setInt(2, id1);
            cst.registerOutParameter(3, Types.INTEGER);
            cst.registerOutParameter(1, OracleTypes.CURSOR);
            try{
                cst.execute();
            }
            catch(SQLException e)
            {
                System.out.println("No record found !!");
                //System.exit(0);
            }
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
