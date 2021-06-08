/*
Stored procedure:
===================
create or replace procedure getEmpInfoBySal(initialChar IN varchar2, emps OUT SYS_REFCURSOR) as
begin
    open emps for select * from employee where ename like initialChar;
end;
/
*/

import java.sql.*;
import oracle.jdbc.*;   /* for OracleTyes.CURSOR and it is present in ojdbc6.jar */
import java.util.Scanner;
public class StoredProcedureDemoC6
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
            CallableStatement cst = con.prepareCall("{call getEmpInfoBySal(?, ?)}");
            System.out.print("Enter the initial character from name of employee\t:");
            String initialChar = sc.next() + "%";
            cst.setString(1, initialChar);
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
