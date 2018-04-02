import java.text.SimpleDateFormat;
import java.util.*;

public class date {
    public static void main(String args []){
       Date d = new Date();

        SimpleDateFormat format1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("'Day' dd  \n'Month' MM  \n'Year' yyyy \n'Time zone' z");

        System.out.println(format2.format(d));
        System.out.println(format1.format(d));

        Calendar cal = Calendar.getInstance();
        System.out.printf("%te %<tB %<tY",cal);
    }
}
