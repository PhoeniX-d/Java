import java.sql.*;

public class JDBCDemoT4Driver {
    public static void main(String[] args) throws Exception {
        
        /* Optional */
        /*Class.forName("oracle.jdbc.OracleDriver");*/
        
        /* Type 4 Driver URL */
        try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "xe", "xe"))
        {
             /* Type 4 Driver URL */
            // System.out.println(con.getClass().getName());
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
