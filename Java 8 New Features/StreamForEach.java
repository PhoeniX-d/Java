import java.util.*;
public class StreamForEach{
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("AA");
        l1.add("AAAAA");
        l1.add("XXXCXX");
        l1.add("QQQQ");
        l1.add("A");
        Comparator<String> c = (s1, s2)->{
            int a = s1.toString().length();
            int b = s2.toString().length();
            return a > b ? -1:(a < b) ? 1 : 0;
        };
        System.out.println("Original List:\n" + l1);
        // l1.stream().forEach(s -> System.out.println(s));
        l1.stream().forEach(System.out::println);
    }
}
