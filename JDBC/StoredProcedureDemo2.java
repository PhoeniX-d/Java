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
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd);
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
