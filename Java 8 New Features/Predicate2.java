import java.util.function.*;
public class Predicate2 {
    public static void main(String[] args) {
        int[] z = {0, 5, 10, 15, 14, 16, 20, 25, 30, 35, 40, 45, 50};
        Predicate<Integer> p1 = i -> (i > 10);
        Predicate<Integer> p2 = i -> (i % 2 == 0);
        System.out.println("\nThe numbers greater than 10 : "); m1(p1, z);
        System.out.println("\nThe even numbers are : "); m1(p2, z);
        System.out.println("\nThe odd numbers are : "); m1(p2.negate(), z);
        System.out.println("\nThe numbers not greater than 10 : "); m1(p1.negate(), z);
        System.out.println("\nThe numbers not greater than 10 and even : "); m1(p1.and(p2), z);
        System.out.println("\nThe numbers not greater than 10 or even : "); m1(p1.or(p2), z);
    }    

    public static void m1(Predicate<Integer> p, int[] z){
        for(int i : z)
            if(p.test(i))
                System.out.print(i + " ");
    }
}
