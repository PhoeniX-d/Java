package com.localhost.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
*   @Autor : Pranav Choudhari
*   @Company : -
*/

public class JDBCCodingStandardDemo1
{
    public static void main(String[] args) {
        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "xe", "xe");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM EMPLOYEE");
            System.out.println("EID\tENAME\tECITY\tSAL");
			System.out.println("--------------------------------------");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4));
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(rs != null)
                    rs.close();
                if(st != null)
                    st.close();
                if(con != null)
                    con.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}
