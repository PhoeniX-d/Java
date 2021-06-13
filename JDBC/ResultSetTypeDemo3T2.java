/*
    Note: Very few Drivers provide support for SCROLL_SENSITIVE Result Sets. Type-1 Driver will
    provide support for this feature. But it supports only update operation, but not delete and insert
    operations.
    Type-2 driver also can provide support for SCROLL_SENSITIVE ResultSets. But we should not use *
    in select query. we should use only column names. It supports only update operation, but not
    delete and insert operations.
*/

import java.sql.*;

public class ResultSetTypeDemo3T2 {
    public static void main(String[] args) throws Exception {
        java.util.Properties p = new java.util.Properties();
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
            p.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String user = p.getProperty("OracleUser");
        String pwd = p.getProperty("OraclePwd");

        try (Connection con = DriverManager.getConnection("jdbc:oracle:oci:@XE", user, pwd)) {
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery = "select eid, ename, city, sal from employee";
            boolean flag = false;
            ResultSet rs = st.executeQuery(sqlQuery);
           
            System.out.println("EID\tENAME\tECITY\tSAL");
            System.out.println("--------------------------------------");
            while (rs.next()) {
                flag = true;
                System.out.println(
                        rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
            }
            if (flag == false) {
                System.out.println("No Records found");
                return;
            }

            System.out.println("Application is in pasuing state, now please update database....");
            System.in.read();
            rs.beforeFirst();
            System.out.println("Records after updation in database...");

            System.out.println("EID\tENAME\tECITY\tSAL");
            System.out.println("--------------------------------------");
            while (rs.next()) {
                flag = true;
                rs.refreshRow();
                System.out.println(
                        rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
            }
            if (flag == false) {
                System.out.println("No Records found");
                return;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
