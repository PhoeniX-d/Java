import java.util.*;
class HashSetDemo
{
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("B");
        h.add("C");
        h.add("Q");
        h.add("L");
        h.add(null);
        h.add(10);
        System.out.println(h);
    }
}
