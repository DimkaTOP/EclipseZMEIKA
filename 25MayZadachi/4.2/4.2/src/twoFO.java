import java.time.LocalDateTime;
import java.time.Month;

public class twoFO {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2022, Month.JANUARY, 1, 12, 30);
        System.out.println("Date and time: " + dateTime);
    }
}