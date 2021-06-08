/*
    STORED PROCEDURE:
    
    create or replace procedure getSal(xeid in number, xsal out number) as
    BEGIN
        select sal into xsal from employee where eid = xeid;
    END;
    /   
*/


import java.sql.*;
import java.util.Scanner;
public class StoredProcedureDemo2
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
            CallableStatement cst = con.prepareCall("{call getSal(?, ?)}");
            System.out.print("Enter the employee id:\t");
            int eid = sc.nextInt();
            cst.setInt(1, eid);
            cst.registerOutParameter(2, Types.FLOAT);
            cst.execute();
            System.out.println("Salary of employee with EID " + eid + " is " + cst.getFloat(2));
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
