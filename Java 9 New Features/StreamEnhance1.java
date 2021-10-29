import java.util.*;
import java.util.stream.*;
public class StreamEnhance1{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i = 0; i <= 10; i++)
            l1.add(i);

        System.out.println("Before using flatmap() method : " + l1);
        List<Integer> l2 = l1.stream().flatMap(
            i -> { if(i % 2 != 0) return Stream.empty();
                    else return Stream.of(i);
                }
        ).collect(Collectors.toList());
        System.out.println("After using flatmap() method : " + l2);

        System.out.println("Before using flatmap() method : " + l1);
        List<Integer> l3 = l1.stream().flatMap(
            i -> { if(i % 2 != 0) return Stream.empty();
                    else return Stream.of(i, i * i);
                }
        ).collect(Collectors.toList());
        System.out.println("After using flatmap() method : " + l3);
    }
}