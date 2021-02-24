import java.util.*;
class TreeSetDemo
{
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("B");
        t.add("A");
        t.add("Q");
        t.add("D");
        t.add("E");
        t.add("V");
        //t.add(null);  -- NullPointerException
        //t.add(10);    -- ClassCastException
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet("D"));
        System.out.println(t.tailSet("D"));
        System.out.println(t.subSet("A", "E"));
        System.out.println(t.comparator());
    }
}
