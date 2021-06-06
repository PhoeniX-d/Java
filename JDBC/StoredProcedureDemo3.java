/*
    STORED PROCEDURE:
    
    create or replace procedure getNameSal(xeid in number, xename out varchar2, xsal out number) as
    BEGIN
        select ename, sal into xename, xsal from employee where eid = xeid;
    END;
    /   
*/


import java.sql.*;
import java.util.Scanner;
public class StoredProcedureDemo3
{
    public static void main(String[] args) {
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        boolean flag = false;
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd);
            Scanner sc = new Scanner(System.in))
        {
            CallableStatement cst = con.prepareCall("{call getNameSal(?, ?, ?)}");
            System.out.print("Enter the employee id:\t");
            int eid = sc.nextInt();
            cst.setInt(1, eid);
            cst.registerOutParameter(2, Types.VARCHAR);
            cst.registerOutParameter(3, Types.FLOAT);
            try
            {
                cst.execute();
            }
            catch(Exception e)
            {
                flag = true;
                System.out.println("Record No Found !!!");
            }
            if(flag == false)
                System.out.println("Name and Salary of employee with EID " + eid + " is " + cst.getString(2) + " & " + cst.getFloat(3));
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
