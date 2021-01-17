import java.sql.SQLException;

class Test {

    public static void main(String[] args) throws ArithmeticException 
    {
        int x = 10;
        String s = null;
        try
        {
            System.out.println("s1");
            System.out.println("s2");
            System.out.println("s3");
            try
            {
                System.out.println("s4");
                System.out.println("s5");
                System.out.println("s6");
            }
            catch(ArithmeticException e)
            {
                System.out.println("s7");
            }
            finally
            {
                System.out.println("s8");
                
            }
            System.out.println("s9");
        }
        catch(AssertionError r)
        {
            
        }
        finally
        {
            System.out.println(10 / 0);
        }
        System.out.println("s12");
    }
}
