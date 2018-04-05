import java.io.ByteArrayInputStream;
import java.util.Scanner;

//work with array of bytes
public class byteArrayInputStream {
    public static void main (String args []){
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte b [] = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b,1,3);

        Scanner sc1 = new Scanner(input1);
        Scanner sc2 = new Scanner(input2);
        String a = sc1.next();
        String c = sc2.next();

        System.out.println(a);//output all from string
        System.out.println(c);//output part of string
        System.out.println(a.toUpperCase());//output all from string toUpperCase
    }
}