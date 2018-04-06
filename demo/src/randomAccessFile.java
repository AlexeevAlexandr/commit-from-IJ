import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class randomAccessFile {
    public static void main (String args []){
        StringBuilder res = new StringBuilder();

        try(RandomAccessFile dout1 = new RandomAccessFile ("D:\\2\\demo.txt", "rws")){ //access to file can be: r-read; rw-read, write; rws-read, write, seek;
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();

            long q = dout1.length();//overwriting in file with random access (now in end string)
            dout1.seek(q);

            dout1.write(st.getBytes());
            dout1.close();
        }catch(IOException e){System.out.println("Error: "+e);}

        try (RandomAccessFile dout2 = new RandomAccessFile ("D:\\2\\demo.txt", "r")){
            int s = dout2.read();
            while(s != -1){
                res.append((char) s);//string builder, analog res += (char) s;
                s = dout2.read();
            }
            dout2.close();
            System.out.println(res);
        }catch(IOException e){System.out.println("Error: "+e);}
    }
}

