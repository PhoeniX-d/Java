
import java.util.*;
class TreeSetDemo2
{
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add("Gold");
        t.add("Platinum");
        t.add("Gemes");
        t.add("Silver");
        t.add("Diamond");
        System.out.println(t);
    }
}

class MyComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String s1 = obj1.toString();        
        String s2 = (String) obj2;
        return s2.compareTo(s1);
    }
}
