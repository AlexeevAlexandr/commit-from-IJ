import java.text.SimpleDateFormat;
import java.util.*;

public class date {
    public static void main(String[] args){
       Date d = new Date();

        SimpleDateFormat format1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("'Day' dd  \n'Month' MM  \n'Year' yyyy \n'Time zone' z");

        System.out.println(format2.format(d));
        System.out.println(format1.format(d));

        System.out.println();

        Calendar cal = Calendar.getInstance();
        System.out.printf("%tT",cal);//14:49:09
        System.out.printf(" %tA %n",cal);//вторник
        System.out.printf("%te %<tB %<tY %n",cal);//3 апреля 2018
        System.out.printf("%tc",cal);//вт апр. 03 14:49:09 EEST 2018
    }
}
