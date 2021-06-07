/* 
Batch Updates -
Advantages of Batch Updates:
1. Network traffic will be reduced
2. Performance will be improved
Limitations of Batch updates:
1. We can use Batch Updates concept only for non-select queries. If we are trying to use for select
queries then we will get RE saying BatchUpdateException.
2. In batch if one sql query execution fails then remaining sql queries wont be executed.
*/

import java.sql.*;

public class BatchUpdateDemo1 {
    public static void main(String[] args){
        try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "xe", "xe"))
        {
            Statement st = con.createStatement();
            st.addBatch("insert into employee values(21, 'Pranav', 'Pune', 15000)");
            st.addBatch("update employee set sal = sal + 2000 where sal < 10000");
            st.addBatch("update employee set sal = sal - 1000 where sal > 15000");

            int []count = st.executeBatch();
            System.out.println("The number of rows updated\t:" + count.length);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }    
}
