import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class data_book_HashMap{
    public static void main(String []args){
        String name="";
        int z;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> myMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(myMap.get(s)!=null) {
                z=myMap.get(s);
                System.out.println(s+"="+z);}
            else{System.out.println("Not found");}
        }
        in.close();
    }
}
