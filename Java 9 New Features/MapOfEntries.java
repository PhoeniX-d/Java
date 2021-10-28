import java.util.Map;
public class MapOfEntries {
    public static void main(String[] args) {
        // Map.Entry<String, String> e1 = Map.entry("A", "Apple");
        // Map.Entry<String, String> e2 = Map.entry("B", "Banana");
        // Map.Entry<String, String> e3 = Map.entry("C", "Cat");
        // Map<String, String> m = Map.ofEntries(e1, e2, e3);
        // System.out.println(m);

        Map<String, String> map = Map.ofEntries(Map.entry("A", "Apple"), Map.entry("B", "Banana"), Map.entry("C", "Cat"));
        System.out.println(map);
    }
}
