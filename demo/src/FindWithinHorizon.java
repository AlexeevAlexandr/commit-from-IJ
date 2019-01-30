import java.io.*;
import java.util.*;

public class FindWithinHorizon {
    public static void main(String[] args) {
        try {
            FileReader st = new FileReader("D:\\2\\demo.txt");
            Scanner sc = new Scanner(st);
            //sc.findInLine("Tom");   //looking for exact match in string
            sc.findWithinHorizon("om", 0);//looking for part match in string (if horizon=0 - looking for in all string)
            if (sc.hasNext()) System.out.println(sc.next());
            else System.out.println("File empty");
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Not found");
        }
    }
}
