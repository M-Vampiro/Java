import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class DemoLocalDate {
    public static void main(String[] args) {

    String date = "1987-13-12";

    LocalDate date2 = LocalDate.of(1999, 10, 1);
    System.out.println(date2.toString());

    LocalDate date3 = LocalDate.of(1999, 10, 2);
    if (date3.isAfter(date2)) {
        System.out.println("date 3 > date 2");
    } else if (date3.equals(date2)) {
        System.out.println("date 3 == date 2");
    } else{ // isBefore
        System.out.println("date 3 < date 2");
    }

    System.out.println(date3.isLeapYear()); // false
    System.out.println(LocalDate.of(2100, 10, 1).isLeapYear()); // false
    System.out.println(LocalDate.of(2000, 10, 1).isLeapYear()); // true

    System.out.println(date3.getMonthValue()); // 10
    System.out.println(date2.getMonth().toString()); // OCTOBER



            }
}
