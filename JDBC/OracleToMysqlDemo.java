import java.sql.*;

public class OracleToMysqlDemo {
    public static void main(String[] args) throws SQLException {
        java.util.Properties p = new java.util.Properties();
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
            p.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jdbc_url1 = p.getProperty("OracleURL");
        String user1 = p.getProperty("OracleUser");
        String pwd1 = p.getProperty("OraclePwd");
        String jdbc_url2 = p.getProperty("MysqlURL");
        String user2 = p.getProperty("MysqlUser");
        String pwd2 = p.getProperty("MysqlPwd");

        Connection con1 = DriverManager.getConnection(jdbc_url1, user1, pwd1);
        Connection con2 = DriverManager.getConnection(jdbc_url2, user2, pwd2);
        Statement st1 = con1.createStatement();
        Statement st2 = con2.createStatement();

        ResultSet rs = st1.executeQuery("SELECT * FROM EMPLOYEE");
        int iCnt = 0;
        while (rs.next()) {
            iCnt++;
            int eid = rs.getInt(1);
            String ename = rs.getString(2);
            String eaddr = rs.getString(3);
            float esal = rs.getFloat(4);
            String sqlquery = String.format("insert into employees values(%d, '%s', %f, '%s')", eid, ename, esal,
                    eaddr);
            st2.executeUpdate(sqlquery);
        }
        System.out.println("Total number of records copied from Oracle Database to Mysql databse are\t:" + iCnt);
        con1.close();
        con2.close();
    }
}
