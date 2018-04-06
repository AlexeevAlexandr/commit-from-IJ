import java.io.*;

public class SerializationDemo{
    public static void main (String args [] ){
        //write info howe object in file
        try (ObjectOutputStream objOStrm = new ObjectOutputStream ( new FileOutputStream ( "D:\\2\\demo.txt" ))) {
            MyClass objectl = new MyClass("Hello", -7, 2.7e10);
            System.out.println("objectl: "+objectl);
            objOStrm.writeObject(objectl);
        }catch (IOException e){System.out.println("Исключение при сериализации: "+e);}
        //recovery info from file
        try (ObjectInputStream objIStrm = new ObjectInputStream (new FileInputStream ("D:\\2\\demo.txt"))) {
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2: "+object2);
        }catch(Exception e) {
            System.out.println("Исключение при десериализации: " + e);
            System.exit(0);
        }
    }
}
class MyClass implements Serializable {
    private String s;
    private int i;
    double d;
    MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }
        public String toString(){
        return "s= " + s + "; i= " + i + "; d= " + d;
    }
}