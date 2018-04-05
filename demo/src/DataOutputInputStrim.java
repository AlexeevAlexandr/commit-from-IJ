import java.io.*;

class DataOutputInputStrim {
    public static void main (String args []){
        try (DataOutputStream dout = new DataOutputStream ( new FileOutputStream ("demo1.txt"))){
            dout.write (15*2);
        }catch (FileNotFoundException e ){System.out.println("Heльзя открыть файл вывода"); return;}
        catch (IOException e){System.out.println("Owибкa ввода - вывода : "+ e);}

        try (DataInputStream din = new DataInputStream ( new FileInputStream ("demo1.txt"))){
            int d = din.read();
            System.out.println(d);
        }catch (FileNotFoundException e) {
            System.out.println("File does not open");
        }catch (IOException e) {
            System.out.println("Error input - output: " + e);
        }
    }
}