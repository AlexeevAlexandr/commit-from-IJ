package Collection;

import java.util.*;

public class Tree_Hash_Linked_Map {
    public static void main(String[] args){
        //HashMap - contains element don`t safe sequence inputting
        //TreeMap - contains sorted elements by key
        //LinkedHashMap - contains elements as they are were inputted
        Map<String, Double> tm = new TreeMap<>();
        tm.put("Ben Dou", 345.02);
        tm.put("Ann Parker", 210.12);
        tm.put("Carl Smith", 587.56);

        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for(Map.Entry<String, Double> me : set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        double d = scan.nextDouble();

        double dd = tm.get(s);
        tm.put(s, dd + d);
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
