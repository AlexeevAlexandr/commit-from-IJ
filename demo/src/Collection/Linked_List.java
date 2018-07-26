package Collection;

import java.util.*;

import static java.lang.System.out;

public class Linked_List {
    public static void main (String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(-5);
        list.add(5);
        list.add(10);
        list.add(-10);
        out.println("original list: "+list);

        Comparator<Integer> r = Collections.reverseOrder();//sort and reverse list
        list.sort(r);
        out.print("sort list: ");
        for(int i : list) out.print(i + " ");

        out.println();

        Collections.shuffle(list);//shuffle list
        out.print("shuffle list: ");
        for(int i : list) out.print(i + " ");

        out.println();

            out.print("min: ");
            out.println(Collections.min(list));//find min element

            out.print("max: ");
            out.println(Collections.max(list));//find max element
    }
}
