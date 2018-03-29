import java.io. *;
import java.util.*;

class PhoneBook{
    public static void main (String args[]) throws IOException{
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        Properties ht = new Properties ();
        BufferedReader br= new BufferedReader(new InputStreamReader (System.in));

        try {
            fin = new FileInputStream("phonebook.txt");
            System.out.println("File found.");
        }catch(FileNotFoundException e) {System.out.println("File not found."); }

        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException ee) {System.out.println("Error reading file.");}

        do {
            System.out.println("Bвeдитe имя ('q' для завершения): ");
            name = br.readLine();
            if (name.equals("q")) continue;
            System.out.println("Bвeдитe номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("q"));

        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.txt");
            ht.store(fout, "Phone book");
            fout.close();
        }

        do {
            System.out.println("Bвeдитe имя для поиска ('q' для завершения): ");
            name = br.readLine();
            if (name.equals("q")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        }while (!name.equals("q")) ;
    }
}