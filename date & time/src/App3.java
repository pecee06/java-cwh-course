import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App3 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // Creating a formatter
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/mm/yy");

        String date = dt.format(dtf1);  // Using the formatter
        System.out.println(date);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy|mm|dd");

        String date2 = dt.format(dtf2);
        System.out.println(date2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss");

        String time = t.format(dtf3);
        System.out.println(time);
    }
}
