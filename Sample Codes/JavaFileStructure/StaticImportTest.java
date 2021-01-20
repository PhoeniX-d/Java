//import static java.lang.Integer.MAX_VALUE;  /* Highest precedence Explicit import */
import static java.lang.Byte.*; /* lower precence Implicit import */

class Test 
{
//    static int MAX_VALUE = 999;       /* higher precedence default package */
    public static void main(String[] args) 
    {
        System.out.println(MAX_VALUE);
    }
}
