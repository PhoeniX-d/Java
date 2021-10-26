import java.time.*;
public class JodaTimeAPI5 {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        ZoneId zonex = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt = ZonedDateTime.now(zonex);
        System.out.println(zt);
    }
}
