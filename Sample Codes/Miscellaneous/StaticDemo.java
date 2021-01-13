class Demo
{
    public Demo()
    {
        System.out.println("Inside Demo constructor()");
    }

    public static void fun()
    {
        System.out.println("Inside fun()");
    }
}

public class StaticDemo
{
    static
    {
        System.out.println("Inside Static block");
        Demo.fun();
    }
       
    public static void main(String[] args)
    {
        Demo d = new Demo();
    }
}
