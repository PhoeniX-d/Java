/*
Stored procedure:
===================
create or replace function getAvg(eid1 IN number, eid2 IN number) return number as
sal1 number;
sal2 number;
BEGIN
    select sal into sal1 from employee where eid = eid1;
    select sal into sal2 from employee where eid = eid2;
    return (sal1 + sal2) / 2;
END;
/
*/

import java.sql.*;
import oracle.jdbc.*;   /* for OracleTyes.CURSOR and it is present in ojdbc6.jar */
import java.util.Scanner;
public class StoredProcedureDemoF7
{
    public static void main(String[] args) {
        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "xe";
        String pwd = "xe";
        try(Connection con = DriverManager.getConnection(jdbcurl, user, pwd);
        Scanner sc = new Scanner(System.in))
        {
            CallableStatement cst = con.prepareCall("{ ?= call getAvg(?, ?)}");
            System.out.print("Enter the eid of employee 1\t:");
            int id1 = sc.nextInt();
            System.out.print("Enter the eid of employee 2\t:");
            int id2 = sc.nextInt();
            cst.setInt(2, id1);
            cst.setInt(3, id2);
            cst.registerOutParameter(1, Types.FLOAT);
            try{
                cst.execute();
            }
            catch(SQLException e)
            {
                 System.out.println("No record found !!");
                 System.exit(0);
            }
            ResultSet rs = (ResultSet)cst.getObject(1);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
