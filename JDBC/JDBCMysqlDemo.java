import java.sql.*;
public class JDBCMysqlDemo
	{
	public static void main(String[] args) throws Exception
	{
		//String driver="com.mysql.jdbc.Driver";
		String jdbc_url="jdbc:mysql://localhost:3306/jdbcdb";
		String user="root";
		String pwd="";
		
		try(Connection con = DriverManager.getConnection(jdbc_url,user,pwd))
		{
			Statement st = con.createStatement();
			String sqlQuery="select * from employee";
			//String sqlQuery="select * from employee where sal > 12000";
			boolean flag= false;
			//System.out.println(st.executeUpdate(sqlQuery));
			
			ResultSet rs = st.executeQuery(sqlQuery);
			System.out.println("EID\tENAME\tESAL\tEADDR");
			System.out.println("--------------------------------------");
			while(rs.next())
			{
				flag = true;
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
			}
			if(flag == false)
			{
				System.out.println("No Records found");
			}
		}		
	}
}
