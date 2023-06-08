
import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1990, Month.JANUARY, 1);
        DayOfWeek dayOfWeek = birthday.getDayOfWeek();
        int dayOfYear = birthday.getDayOfYear();
        Month month = birthday.getMonth();
        int year = birthday.getYear();

        System.out.println("Birthday: " + birthday);
        System.out.println("Day of week: " + dayOfWeek);
        System.out.println("Day of year: " + dayOfYear);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}