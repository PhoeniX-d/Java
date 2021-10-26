import java.time.*;
public class JodaTimeAPI3 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();
        System.out.println(h + ":" + m + ":" + s + ":" + n);
    }
}
