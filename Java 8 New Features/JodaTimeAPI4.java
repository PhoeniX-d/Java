import java.time.*;
public class JodaTimeAPI4 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(1999, Month.DECEMBER, 24, 12, 20, 23);
        System.out.println(dt);
        System.out.println("After six months : " + dt.plusMonths(6));
        System.out.println("Before six months : " + dt.minusMonths(6));
        
    }
}
