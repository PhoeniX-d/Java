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

public class JDBCUtil
{
    static
    {        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public static Connection getOracleConnection() throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "xe", "xe");
        return con;
    }
       
    public static void cleanup(Connection con, Statement st, ResultSet rs)
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
