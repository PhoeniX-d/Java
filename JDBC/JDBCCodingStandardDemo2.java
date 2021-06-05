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

public class JDBCCodingStandardDemo2
{
    public static void main(String[] args) {
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try
        {
            con = JDBCUtil.getOracleConnection();
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
            JDBCUtil.cleanup(con, st, rs);
        }
    }
}
