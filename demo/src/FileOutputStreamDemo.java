import java.io.*;
import java.util.Scanner;

//writing bytes in a files
class FileOutputStreamDemo {
    public static void main(String args[]) {
        String source = "Now is the time for all good men";
        byte buf[] = source.getBytes();

        try (FileOutputStream f1 = new FileOutputStream("D:\\2\\demo1.txt");
             FileOutputStream f2 = new FileOutputStream("D:\\2\\demo2.txt");
             FileOutputStream f3 = new FileOutputStream("D:\\2\\demoЗ.txt")) {

            f1.write(buf);
            for (int i=0; i<buf.length; i+=2) f2.write(buf[i]);
            f3.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {System.out.println("Error input"+e);}

        try (FileInputStream f1 = new FileInputStream("D:\\2\\demo1.txt");
             FileInputStream f2 = new FileInputStream("D:\\2\\demo2.txt");
             FileInputStream f3 = new FileInputStream("D:\\2\\demoЗ.txt")) {
            Scanner sc1 = new Scanner(f1);
            Scanner sc2 = new Scanner(f2);
            Scanner sc3 = new Scanner(f3);
            System.out.println(sc1.nextLine());
            System.out.println(sc2.nextLine());
            System.out.println(sc3.nextLine());
        }catch(IOException e) {System.out.println("Error output"+e);}
    }
}