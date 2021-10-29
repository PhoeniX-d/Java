import java.util.*;
import java.util.stream.*;
public class StreamEnhance4 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("A");
        l.add("B");
        l.add(null);
        l.add("D");
        l.add("C");
        l.add(null);

        System.out.println(l);

        List<String> l2 = l.stream().filter(s -> s != null).collect(Collectors.toList());
        System.out.println(l2);

        List<String> l3 = l.stream().flatMap(s -> Stream.ofNullable(s)).collect(Collectors.toList());
        System.out.println(l3);

    }
}