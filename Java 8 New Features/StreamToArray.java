import java.util.*;
public class StreamToArray{
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("AA");
        l1.add("AAAAA");
        l1.add("XXXCXX");
        l1.add("QQQQ");
        l1.add("A");
        System.out.println("Original List:\n" + l1);
        String[] sa = l1.stream().toArray(String[]::new);
        for(String  s : sa)
            System.out.println(s);
    }
}
