import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class qq {
    public static void main (String args []){
        String res = "";
        try(RandomAccessFile dout1 = new RandomAccessFile ("demo.txt", "rw")){
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();
            dout1.write(st.getBytes());
            dout1.close();
        }catch(IOException e){System.out.println("Error: "+e);}
        try (RandomAccessFile dout2 = new RandomAccessFile ("demo.txt", "r")){
            int s = dout2.read();
            while(s != -1){
                res += (char)s;
                s = dout2.read();
            }
            dout2.close();
            System.out.println(res);
        }catch(IOException e){System.out.println("Error: "+e);}
    }
}

