import java.util.*;
import java.util.stream.*;
public class StreamCollect {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i = 1; i <= 10; i++)
            l1.add(i);
        
        System.out.println("Original List:\n" + l1);
        List<Integer> l2 = l1.stream().filter(i -> (i % 2) == 0).collect(Collectors.toList());
        System.out.println("Filtered List:\n" + l2);
    }
}
