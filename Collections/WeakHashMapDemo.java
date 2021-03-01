import java.util.*;
class Temp
{
    public String toString()
    {
        return "Temp";
    }

    public void finalize()
    {
        System.out.println("finalize method called");
    }
}
class WeakHashMapDemo
{   
    public static void main(String[] args)  throws Exception
    {
        
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t, "Durga");
        System.out.println(m);
        t = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(m);
        
    }
}
