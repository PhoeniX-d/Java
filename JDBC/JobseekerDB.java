package com.localhost.jobseeker;

import java.util.*;
import java.io.*;
import java.sql.*;
import java.text.*;

public class JobseekerDB {
    public static void main(String[] args) {
        java.util.Properties p = new java.util.Properties();
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
            p.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jdbc_url = p.getProperty("OracleURL");
        String user = p.getProperty("OracleUser");
        String pwd = p.getProperty("OraclePwd");

        String name = "Alan";
        String dob = "28-05-1988";
        String pic = "image1.jpg";
        String resume = "AlanResume.txt";

        try (Connection con = DriverManager.getConnection(jdbc_url, user, pwd);
                FileInputStream fis = new FileInputStream(pic);
                FileReader fr = new FileReader(resume);
                FileOutputStream fos = new FileOutputStream("updatedimage1.jpg");
                PrintWriter pw = new PrintWriter("upatedAlanResume.txt");) {
            PreparedStatement ps = con.prepareStatement("insert into jobseeker values(?, ?, ?, ?)");
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date udate = sdf.parse(dob);
            long l = udate.getTime();
            java.sql.Date sdate = new java.sql.Date(l);
            ps.setString(1, name);
            ps.setDate(2, sdate);
            ps.setBinaryStream(3, fis);
            ps.setCharacterStream(4, fr);
            if (ps.executeUpdate() == 0)
                System.out.println("Record not inserted!!");
            else
                System.out.println("Record inserted successfully.....");

            System.out.println("Reading Record....");
            ps = con.prepareStatement("select * from jobseeker");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                // read name
                System.out.println("Name of Person\t: " + rs.getString(1));

                // reading dob
                sdate = rs.getDate(2);
                System.out.println("DOB\t\t: " + sdf.format(sdate));

                // reading BLOB (image)
                InputStream is = rs.getBinaryStream(3);
                byte[] b = new byte[1024];
                while (is.read(b) > 0) {
                    fos.write(b);
                }
                fos.flush();

                // reading CLOB (txt)
                Reader r = rs.getCharacterStream(4);
                char[] c = new char[1024];
                while (r.read(c) > 0) {
                    pw.write(c);
                }
                pw.flush();

            }
            System.out.println("Record achieved successfully....");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
