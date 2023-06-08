import java.time.LocalDate;
import java.time.Month;

public class Dds {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1990, Month.JANUARY, 1);
        LocalDate currentDate = LocalDate.now();

        if (currentDate.isAfter(birthday)) {
            System.out.println("Current date is after birthday");
        } else if (currentDate.isBefore(birthday)) {
            System.out.println("Current date is before birthday");
        } else {
            System.out.println("Current date is the same as birthday");
        }
    }
}
