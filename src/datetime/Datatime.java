package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Datatime {

    public static void main(String[] args) {

        // Data time coding
        // Display current date

        // local current date
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);
        // local current time
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        // date and time
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);
    }
}
