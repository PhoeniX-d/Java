import java.util.Date;
class RuntimeDemo
{
    public static void main(String[] args) 
    {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total Memory\t:" + r.totalMemory());
        System.out.println("Free Memory\t:" + r.freeMemory());
        for(int i = 0; i < 100000; i++)
        {
            Date d = new Date();
            d = null;
        }
        r.gc();
        System.out.println("Free Memory\t:" + r.freeMemory());
        r.gc();
        System.out.println("Free Memory\t:" + r.freeMemory());
    }
}
