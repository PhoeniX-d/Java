package ExceptionHandling;

public class DefaultEH 
{
    public static void main(String[] args)    
    {
        doStuff();
        System.out.println(10 / 0);
    }

    public static void doStuff()
    {
        doMoreStuff();
    }
    
    public static void doMoreStuff()
    {
        System.out.println("Hello");
    }
}
