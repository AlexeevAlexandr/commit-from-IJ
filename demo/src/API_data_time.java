import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class API_data_time {
    public static void main (String args []){
        LocalDate ld = LocalDate.now();
        System.out.println(ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));//format can will be FULL, LONG, MEDIUM, SHORT

        LocalTime ld2 = LocalTime.now();
        System.out.println(ld2.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));

        LocalDateTime ld3 = LocalDateTime.now();
        System.out.println(ld3.format(DateTimeFormatter.ofPattern("EEEE\nd MMMM yyyy\nH':'mm':'ss")));
    }
}
