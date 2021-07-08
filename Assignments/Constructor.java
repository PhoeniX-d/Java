import java.io.*;
import java.lang.*;

class Demo
{
    public int i = 10;
    public int j = 20;

    Demo()
    {
        System.out.println("Inside Constructor");
    }

    Demo(int x, int y)
    {
        System.out.println("Inside Paramterized Constructor");
        i = x;
        j = y;
    }
}
class Constructor
{
    public static void main(String args[])
    {
        Demo dObj1 = new Demo();
        Demo dObj2 = new Demo(193, 465);

        
        System.out.println("Object 1's i\t" + dObj1.i);
        System.out.println("Object 1's j\t" + dObj1.j);
        

        System.out.println(dObj1.hashCode());
        System.out.println(dObj2.hashCode());

        System.out.println("Before Copying Object dObj2");
        System.out.println("Object 2's i\t" + dObj2.i);
        System.out.println("Object 2's j\t" + dObj2.j);

        Demo dObj3 = dObj2;
        dObj3.i = 7888;
        dObj3.j = 7856;

        System.out.println("After Copying and changing Object dObj2");

        System.out.println("Object 2's i\t" + dObj2.i);
        System.out.println("Object 2's j\t" + dObj2.j);
        System.out.println("Object 3's i\t" + dObj3.i);
        System.out.println("Object 3's j\t" + dObj3.j);
    }
}
