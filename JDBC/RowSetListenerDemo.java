import java.io.FileInputStream;
import java.util.Properties;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetListenerDemo {
    public static void main(String[] args) throws Exception{
        RowSetFactory rsf = RowSetProvider.newFactory();
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(".\\..\\..\\db.properties");
        p.load(fis);
        JdbcRowSet jrs = rsf.createJdbcRowSet();
        jrs.setUrl(p.getProperty("MysqlURL"));
        jrs.setUsername(p.getProperty("MysqlUser"));
        jrs.setPassword(p.getProperty("MysqlPwd"));
        jrs.setCommand("select * from employees");
        jrs.addRowSetListener(new RowSetListenerImpl());
        jrs.execute();
        System.out.println("Eid\tEname\tEsal\tEaddr");
        System.out.println("--------------------------------------------");
        while(jrs.next())
        {
            System.out.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getFloat(3) + "\t" + jrs.getString(4));
        }
        jrs.moveToInsertRow();
        jrs.updateInt(1, 7777);
        jrs.updateString(2, "Ajay");
        jrs.updateFloat(3, 10000);
        jrs.updateString(4, "Kolhapur");
        jrs.insertRow();
        jrs.close();        
    }
}

class RowSetListenerImpl implements RowSetListener{
    public void rowSetChanged(RowSetEvent event)
    {
        System.out.println("RowSetChanged");
    }

    public void rowChanged(RowSetEvent event)
    {
        System.out.println("RowChanged");
    }
    
    public void cursorMoved(RowSetEvent event)
    {
        System.out.println("CursorMoved");
    }
}
