import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        
        /* Optional */
        /*Class.forName("oracle.jdbc.OracleDriver");*/
        
        /* Type 2 Driver URL */
        Connection con = DriverManager.getConnection("jdbc:oracle:oci:@XE", "xe", "xe");
        
        /* Type 4 Driver URL */
        /*Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "xe", "xe");*/
        // System.out.println(con.getClass().getName());
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from employee");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        con.close();
    }
}
