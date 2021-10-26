import java.time.*;
public class JodaTimeAPI2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int dom = date.getDayOfMonth();
        int mv = date.getMonthValue();
        int y = date.getYear();
        System.out.println(dom + "/" + mv + "/" + y);
    }
}
