
import java.util.*;
class TreeSetDemo4
{
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add("A");
        t.add("ABC");
        t.add(new StringBuffer("VVWW"));
        t.add("BA");
        t.add("BBA");
        t.add(new StringBuffer("ABCD"));
        System.out.println(t);
    }
}

class MyComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String s1 = obj1.toString();        
        String s2 = obj2.toString();
        int l1 = s1.length();
        int l2 = s2.length();

        if(l1 < l2)
        {
            return -1;
        }
        else if(l1 > l2)
        {
            return 1;
        }
        else
        {
            return s1.compareTo(s2);
        }
    }
}
