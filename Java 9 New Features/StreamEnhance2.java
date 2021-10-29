import java.util.*;
import java.util.stream.*;
public class StreamEnhance2{
    public static void main(String[] args) {
       ArrayList<Integer> l1 = new ArrayList<>();
       l1.add(2);l1.add(4);l1.add(1);l1.add(3);
       l1.add(6);l1.add(5);l1.add(9);l1.add(46);

       System.out.println("Initial List : " + l1);
       List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
       System.out.println("After using filter()[for even nums] : " + l2);

       List<Integer> l3 = l1.stream().takeWhile(i -> i % 2 == 0).collect(Collectors.toList());
       System.out.println("After using takeWhile() [for even nums]: " + l3);

       List<Integer> l4 = l1.stream().takeWhile(i -> i % 3 == 0).collect(Collectors.toList());
       System.out.println("After using takeWhile() [for divisible of 3's]: " + l4);
    }
}