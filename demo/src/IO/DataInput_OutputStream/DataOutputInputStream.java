package IO.DataInput_OutputStream;

import java.io.*;

/**
 * auto create file, write and read data from him
 */
public class DataOutputInputStream {
    public static void main (String args []){
        try (DataOutputStream output = new DataOutputStream ( new FileOutputStream ("demo1.txt"))){
            output.write (15*2);
        }catch (FileNotFoundException e ){System.out.println("File not found"); return;}
        catch (IOException e){System.out.println("Error input/output: "+ e);}

        try (DataInputStream input = new DataInputStream ( new FileInputStream ("demo1.txt"))){
            int d = input.read();
            System.out.println(d);
        }catch (FileNotFoundException e) {
            System.out.println("File does not open");
        }catch (IOException e) {
            System.out.println("Error input - output: " + e);
        }
    }
}