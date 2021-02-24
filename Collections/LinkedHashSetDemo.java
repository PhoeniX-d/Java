import java.util.*;
class LinkedHashSetDemo
{
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("B");
        h.add("C");
        h.add("Q");
        h.add("L");
        h.add(null);
        h.add(10);
        System.out.println(h);
    }
}