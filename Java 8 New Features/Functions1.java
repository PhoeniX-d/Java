import java.util.function.*;
public class Functions1 {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        System.out.println("The length of 'Ashborn' is " + f.apply("Ashborn"));
        System.out.println("The length of 'Shadow' is " + f.apply("Shadow"));
    }
}
