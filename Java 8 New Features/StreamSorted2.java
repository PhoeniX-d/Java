import java.util.*;
import java.util.stream.Collectors;
public class StreamSorted2 {
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
        List<String> l2 = l1.stream().sorted(c).collect(Collectors.toList());
        System.out.println("Sorted List According to Customized Sorting Order:\n" + l2);    }
}
