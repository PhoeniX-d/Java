import java.io.FileInputStream;
import java.sql.*;
import java.util.*;

class PropertiesDemo1
{
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.propertiesx");
        p.load(fis);
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", p);
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
