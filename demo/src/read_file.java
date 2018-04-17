import java.io.*;
import java.util.Scanner;

public class read_file {
    public static void main (String args []){
        String i;
        int count=0;
        try(FileReader fin = new FileReader("D:\\2\\Calculate2.txt")){ //try with parameters - auto closing file
            Scanner sc = new Scanner(fin);
            sc.useDelimiter(",");
            do{
                if (sc.hasNext()) {
                    i = sc.next();
                    System.out.println(i);
                    count +=1;
                }
              }while(sc.hasNext());
            System.out.println("Count string = "+count);

        }catch(IOException e){System.out.println("File not found");}
    }
}
