import java.util.stream.Stream;
public class StreamOf{
    public static void main(String[] args) {
        Integer[] i = {56, 8978, 5862, 7236};
       Stream<Integer> s = Stream.of(i);
       s.forEach(System.out::println);
    }
}
