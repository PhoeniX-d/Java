import java.util.function.*;
public class Predicate1 {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> ((i > 10) && (i % 2) == 0);
        System.out.println("25 > 10 && 25 % 2 == 0 ... ? " + p.test(25));
        System.out.println("24 > 10 && 24 % 2 == 0 ... ? " + p.test(24));
    }    
}
