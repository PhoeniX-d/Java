import java.sql.*;

class PropertiesDemo2
{
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:xe/xe@localhost:1521:XE");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEE");
        boolean flag = false;
        while(rs.next())
        {
            flag = true;
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
        }
        if(flag == false)
        {
            System.out.println("No Record found");
        }
        con.close();
    }
}
