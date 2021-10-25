import java.util.*;
public class StreamCount {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("asa");
        l1.add("hghyj");
        l1.add("rrgffgte");
        l1.add("wttyyes");
        l1.add("fgcfvfgr");
        System.out.println("Original List:\n" + l1);
        long count = l1.stream().filter(s -> s.length() > 5).count();
        System.out.println("Fiilterd count:\n" + count);
    }
}
