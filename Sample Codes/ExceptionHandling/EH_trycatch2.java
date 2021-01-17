/* case : exception raised at s2 and catch block caught */

class Test
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Statement1");
            System.out.println(10 / 0);
            System.out.println("Statement3");
        }
        catch(ArithmeticException e)        
        {
            System.out.println("Statement4");
        }
        System.out.println("Statement5");
    }
}
