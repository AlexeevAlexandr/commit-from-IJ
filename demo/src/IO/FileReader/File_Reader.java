package IO.FileReader;

import java.io.*;
import java.util.Scanner;

public class File_Reader {
    public static void main (String args []){
        String i;
        int count=0;
        try(FileReader fin = new FileReader("E:\\test.txt");
            Scanner sc = new Scanner(fin).useDelimiter(","))
        {
            do{
                if (sc.hasNext()) {
                    i = sc.next();
                    System.out.println(i);
                    count ++;
                }
              }while(sc.hasNext());
            System.out.println("Count string = "+count);
        }catch(IOException e){System.out.println("File not found");}
    }
}
