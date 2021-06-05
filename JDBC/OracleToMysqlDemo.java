import java.sql.*;
public class OracleToMysqlDemo {
    public static void main(String[] args) throws SQLException {
        Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "xe", "xe");
        Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb", "root", "");
        Statement st1 = con1.createStatement();
        Statement st2 = con2.createStatement();

        ResultSet rs = st1.executeQuery("SELECT * FROM EMPLOYEE");
        int iCnt = 0;
        while(rs.next())
        {
            iCnt++;
            int eid = rs.getInt(1);
            String ename = rs.getString(2);
            String eaddr = rs.getString(3);
            float esal = rs.getFloat(4);
            String sqlquery = String.format("insert into employees values(%d, '%s', %f, '%s')", eid, ename, esal, eaddr);
            st2.executeUpdate(sqlquery);
        }
        System.out.println("Total number of records copied from Oracle Database to Mysql databse are\t:" + iCnt);
        con1.close();
        con2.close();
    }
}
