
public class SamplePrintf 
{
    public static void main(String args[])    
    {
        String s1 = "Hello, World";
        int i = 1072;
        float f = 90.5f;
        double d = 90.0;
        char ch = 'A';

        System.out.printf("%s%n%d%n%f%n%f%n%c%n", s1, i, f, d, ch);
        System.out.format("%s%n%d%n%f%n%f%n%c%n", s1, i, f, d, ch);
    }
}
