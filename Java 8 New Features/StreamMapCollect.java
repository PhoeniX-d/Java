import java.util.*;
import java.util.stream.*;
public class StreamMapCollect {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("asa");
        l1.add("hyj");
        l1.add("rte");
        l1.add("wes");
        l1.add("fgr");
        System.out.println("Original List:\n" + l1);
        List<String> l2 = l1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Mapped List:\n" + l2);
    }
}
