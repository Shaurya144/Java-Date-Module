import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(LocalDate.now()); // prints (yyyy-mm-dd)
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj); // prints (hh:mm:ss.nanoseconds)

        LocalDateTime myDateObj = LocalDateTime.now(); // this gives the data and time mashed togethor
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        // This gives the data in a formated way
        String formattedDate = myDateObj.format(myFormatObj);
        // formattedData = TimeRightNow formatted in the myFormatObj pattern
        System.out.println("After formatting: " + formattedDate);

    }
}