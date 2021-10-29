import java.util.*;
import java.util.stream.*;
public class StreamEnhance5 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("A", "Apple");
        m.put("B", "Banana");
        m.put("C", null);
        m.put("D", "Dog");
        m.put("E", null);

        List<String> l1 = m.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList());
        System.out.println(l1);

        List<String> l2 = m.entrySet().stream().flatMap(e -> Stream.ofNullable(e.getValue())).collect(Collectors.toList());
        System.out.println(l2);
    }
}