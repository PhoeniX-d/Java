/*
Stored procedure:
===================
SQL> create or replace procedure getEmpInfo(emps OUT SYS_REFCURSOR) as
  2  begin
  3     open emps for select * from employee;
  4  end;
  5  /
*/

import java.sql.*;
import oracle.jdbc.*; /* for OracleTyes.CURSOR and it is present in ojdbc6.jar */

public class StoredProcedureDemoC4 {
    public static void main(String[] args) {
        java.util.Properties p = new java.util.Properties();
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
            p.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jdbc_url = p.getProperty("OracleURL");
        String user = p.getProperty("OracleUser");
        String pwd = p.getProperty("OraclePwd");

        try (Connection con = DriverManager.getConnection(jdbc_url, user, pwd)) {
            CallableStatement cst = con.prepareCall("{call getEmpInfo(?)}");
            cst.registerOutParameter(1, OracleTypes.CURSOR);
            cst.execute();
            ResultSet rs = (ResultSet) cst.getObject(1);
            boolean bflag = false;
            System.out.println("EID\tENAME\tECITY\tSAL");
            System.out.println("--------------------------------------");
            while (rs.next()) {
                bflag = true;
                System.out.println(
                        rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
            }
            if (bflag == false) {
                System.out.println("Records not available !!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
