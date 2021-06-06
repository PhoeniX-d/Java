import java.sql.*;
public class SelectAllRowsDemo
	{
	public static void main(String[] args) throws Exception
	{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="xe";
		String pwd="xe";
		
		try(Connection con = DriverManager.getConnection(jdbc_url,user,pwd))
		{
			Statement st = con.createStatement();
			String sqlQuery="select * from employee";
			//String sqlQuery="select * from employee where sal > 12000";
			boolean flag= false;
			//System.out.println(st.executeUpdate(sqlQuery));
			
			ResultSet rs = st.executeQuery(sqlQuery);
			System.out.println("EID\tENAME\tECITY\tSAL");
			System.out.println("--------------------------------------");
			while(rs.next())
			{
				flag = true;
				//System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getString("city")+"\t"+rs.getFloat("sal"));
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4));
			}
			if(flag == false)
			{
				System.out.println("No Records found");
			}
		}		
	}
}
