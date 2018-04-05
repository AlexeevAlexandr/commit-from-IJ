import java.io.*;
import java.util.*;

class InputStreamEnumerator implements Enumeration<FileInputStream>{
    private Enumeration<String> files;
    InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }
        public FileInputStream nextElement (){
        try {
            return new FileInputStream(files.nextElement());
        } catch (IOException e){return null;}
    }
}
class SequenceinputStreamDemo {
    public static void main(String args[]) {
        int c;
        Vector<String> files = new Vector<>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("fileЗ.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);
        try {
            while ((c = input.read()) != -1) System.out.print((char) c);
        } catch (NullPointerException e) {
            System.out.println("Error opening file.");
        } catch (IOException e) {
            System.out.println("Error output - input file: " + e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Error close stream input SequenceinputStream");
            }
        }
    }
}