import java.util.*;
class IdentityHashMapDemo
{   
    public static void main(String[] args) {
        
        IdentityHashMap m = new IdentityHashMap();
        Integer i1 = Integer.valueOf(1000);
        Integer i2 = Integer.valueOf(1000);
        m.put(i1, "Pune");
        m.put(i2, "Nashik");
        System.out.println(m);        
    }
}
