import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;

public class ParameterMetadataDemo1 {
	public static void main(String[] args) throws Exception {

		 java.util.Properties p = new java.util.Properties(); java.io.FileInputStream
		 fis = new java.io.FileInputStream(".\\..\\..\\db.properties"); p.load(fis);
		 String jdbcUrl = p.getProperty("OracleURL"); String user =
		 p.getProperty("OracleUser"); String pwd = p.getProperty("OraclePwd");
		 
		/*
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
		p.load(fis);
		String jdbcUrl = p.getProperty("MysqlURL");
		String user = p.getProperty("MysqlUser");
		String pwd = p.getProperty("MysqlPwd");
		*/
		try (Connection con = DriverManager.getConnection(jdbcUrl, user, pwd)) {
			PreparedStatement pst = con.prepareStatement("insert into employee values(?, ?, ?, ?)");
			ParameterMetaData pmd = pst.getParameterMetaData();
			int count = pmd.getParameterCount();
			System.out.println("Total Paramater passed " + count);
			for (int i = 1; i <= count; i++) {
				System.out.println("Parameter Count\t:" + i);
				System.out.println("Parameter Mode\t:" + pmd.getParameterMode(i));
				//System.out.println("Parameter Type\t:" + pmd.getParameterType(i));
				//System.out.println("Parameter Precision\t:" + pmd.getPrecision(i));
				//System.out.println("Parameter Scale\t:" + pmd.getScale(i));
				//System.out.println("Parameter isSigned\t:" + pmd.isSigned(i));
				//System.out.println("Parameter isNullable\t:" + pmd.isNullable(i));
				System.out.println("------------------------------");
			}
		}
	}
}
