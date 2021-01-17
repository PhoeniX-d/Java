/* case : exception raised at s5 */

class Test
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Statement1");
            System.out.println("Statement2");
            System.out.println("Statement3");
        }
        catch(NullPointerException e)        
        {
            System.out.println("Statement4");
        }
        System.out.println(10 / 0);
    }
}
