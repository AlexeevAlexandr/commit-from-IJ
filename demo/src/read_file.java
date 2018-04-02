import java.io.*;
import java.util.Scanner;

public class read_file {
    public static void main (String args []){
        String i;
        int sum=0, count=0;
          try{
            FileReader fin = new FileReader("D:\\2\\Calculate2.txt");
            Scanner sc = new Scanner(fin);
            sc.useDelimiter(",");
            while(sc.hasNext()) {
                if (sc.hasNext()) {
                    i = sc.next();
                    System.out.println(i);
                   }
                }
                while(sc.hasNextInt()){
              if (sc.hasNextInt()) {
                  sum += sc.nextInt();
                  count++;
              }
              }

                sc.close();
            }catch(FileNotFoundException e){System.out.println("File not found");}
        System.out.println(sum);
    }


}
