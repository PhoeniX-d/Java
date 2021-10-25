import java.util.*;
import java.util.stream.Collectors;
public class StreamSorted1 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("asa");
        l1.add("hghyj");
        l1.add("rrgffgte");
        l1.add("wttyyes");
        l1.add("fgcfvfgr");
        System.out.println("Original List:\n" + l1);
        List<String> l2 = l1.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List According to Default Natural Sorting Order:\n" + l2);    }
}
