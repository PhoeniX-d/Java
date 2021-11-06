import java.sql.*;
public void getEmpInfo()throws Exception{
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "xe","xe");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from employee");
	System.out.println("ENO\tENAME\tEADDR");
	System.out.println("-------------------------------------");
	while(rs.next()){
		System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
	}
	con.close();
}