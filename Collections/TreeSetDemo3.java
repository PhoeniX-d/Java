
import java.util.*;
class TreeSetDemo3
{
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(new StringBuffer("Gold"));
        t.add(new StringBuffer("Platinum"));
        t.add(new StringBuffer("Gemes"));
        t.add(new StringBuffer("Silver"));
        t.add(new StringBuffer("Diamond"));
        System.out.println(t);
    }
}

class MyComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String s1 = obj1.toString();        
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}
