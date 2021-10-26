import java.time.*;
public class JodaTimeAPI6 {
    public static void main(String[] args) {
       LocalDate today = LocalDate.now();
       LocalDate birthday = LocalDate.of(1999, 12, 24);
       Period p = Period.between(birthday, today);
       System.out.printf("Age is %d Year %d Months %d Days", p.getYears(), p.getMonths(), p.getDays());
    }
}
