import java.sql.*;
public class SelectParticularColumnsDemo
	{
	public static void main(String[] args) throws Exception
	{
		java.util.Properties p = new java.util.Properties();		
		try
        {
            java.io.FileInputStream fis = new java.io.FileInputStream(".\\..\\..\\db.properties");
            p.load(fis);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		String jdbc_url = p.getProperty("OracleURL");
		String user = p.getProperty("OracleUser");
		String pwd = p.getProperty("OraclePwd");
        
        try(Connection con = DriverManager.getConnection(jdbc_url, user, pwd))
		{
			Statement st = con.createStatement();
			String sqlQuery="select ename, sal, city from employee";
			boolean flag= false;
			ResultSet rs =st.executeQuery(sqlQuery);
			System.out.println("ENAME\tSAL\tCITY");
			System.out.println("--------------------------------------");
			while(rs.next())
			{
				flag = true;
				//System.out.println(rs.getString("ename")+"\t"+rs.getFloat("sal")+"\t"+rs.getString("city"));
				System.out.println(rs.getString(1)+"\t"+rs.getFloat(2)+"\t"+rs.getString(3));
			}
			if(flag == false)
			{
				System.out.println("No Records found");
			}
		}		
	}
}
