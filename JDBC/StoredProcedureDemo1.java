/*
    STORED PROCEDURE:
    
    create or replace procedure summation(num1 IN number,num2 IN number,num3 OUT number) as
    BEGIN
    num3 := num1 + num2;
    END;
    /   
*/


import java.sql.*;
import java.util.Scanner;
public class StoredProcedureDemo1
{
    public static void main(String[] args) {
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd);
            Scanner sc = new Scanner(System.in))
        {
            CallableStatement cst = con.prepareCall("{call summation(?, ?, ?)}");
            System.out.print("Enter the number 1:\t");
            int num1 = sc.nextInt();
            System.out.print("Enter the number 2:\t");
            int num2 = sc.nextInt();
            cst.setInt(1, num1);
            cst.setInt(2, num2);
            cst.registerOutParameter(3, Types.INTEGER);
            cst.execute();
            System.out.println("Output from Stored Procedure\t:" + cst.getInt(3));
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
