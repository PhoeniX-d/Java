import java.util.*;

public class HashMapDemo 
{
    public static void main(String[] args) 
    {
        HashMap h = new HashMap();
        //h.put(null, 700);
        h.put("Astaroth", 700);
        h.put("Jorgen", 800);
        h.put("Maya", 400);
        h.put("Galahad", 500);
        h.put("Kiera", 900);
        System.out.println(h);
        System.out.println(h.put("Astaroth", 10000));
        Set s = h.keySet();
        System.out.println(s);
        Collection c = h.values();
        System.out.println(c);
        Set e = h.entrySet();
        System.out.println(e);

        Iterator itr = e.iterator();
        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println(me.getKey() + "--" + me.getValue());
            if (me.getKey().equals("Astaroth")) {
                me.setValue(1000);
            }
        }
        System.out.println(h);
    }    
}
