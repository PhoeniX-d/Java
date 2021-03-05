import java.util.*;
class LinkedHashSetDemo
{
    public static void main(String[] args) {
        LinkedHashSet<String> h = new LinkedHashSet<String>();
        h.add("India");
        h.add("Japan");
        h.add("Germany");
        h.add("Italy");
        h.add("France");
        h.add("America");

        System.out.println("HashSet = " + h);

        System.out.println("HashSet elements using Iterator");
        Iterator itr = h.iterator();
        
        while(itr.hasNext())
        {
            String s = (String) itr.next();
            System.out.println(s);
        }
    }
}
