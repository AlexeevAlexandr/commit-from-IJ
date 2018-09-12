package IO.FileReader;
/**
 * read, write data
 * delete old data from file
 */

import java.io.*;
import java.util.Scanner;

public class File_Reader {
    public static void main (String args []){

        try(FileWriter out = new FileWriter("E:\\test.txt")){
            String string = "Hello,World";
            out.write(string);
        } catch (IOException e){ System.out.println("Write error"); }

        String i;
        int count=0;
        try(FileReader in = new FileReader("E:\\test.txt");
            Scanner sc = new Scanner(in).useDelimiter(","))
        {
            do{
                if (sc.hasNext()) {
                    i = sc.next();
                    System.out.println(i);
                    count ++;
                }
              } while(sc.hasNext());
            System.out.println("Count string = "+count);
        } catch(IOException e) { System.out.println("Read error"); }
    }
}
