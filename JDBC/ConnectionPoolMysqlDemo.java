import java.sql.*;
import javax.sql.*;
import com.mysql.cj.jdbc.*;
public class ConnectionPoolMysqlDemo
	{
	public static void main(String[] args) throws Exception
	{
        MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();

        ds.setURL("jdbc:mysql://localhost:3306/jdbcdb");
        ds.setUser("root");
        ds.setPassword("");

		
		try(Connection con = ds.getConnection())
		{
			Statement st = con.createStatement();
			String sqlQuery="select * from employees";
			boolean flag= false;			
			ResultSet rs = st.executeQuery(sqlQuery);
			System.out.println("ENO\tENAME\t ESAL\tEADDR");
			System.out.println("-------------------------------------------------");
			while(rs.next())
			{
				flag = true;
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
			}
			if(flag == false)
			{
				System.out.println("No Records found");
			}
		}		
	}
}
