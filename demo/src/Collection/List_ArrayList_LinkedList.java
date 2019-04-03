package Collection;

import java.util.*;
import static java.lang.System.out;

public class List_ArrayList_LinkedList {
    public static void main (String[] args){
        //ArrayList
        //LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);//adds one element
        list.add(1);
        list.add(4);
        list.add(3,20);
        list.addFirst(5);//adds one element to first position
        list.addLast(3);//adds one element to last position
        list.set(2,8);//sets element to position of index "set(index, element)"
        Collections.addAll(list, 10,11,12);//adds multiple elements
        list.remove(5);//remove object by index
        out.println("Original list: "+list);

        Collections.sort(list);//sort list
        out.println("Sorted list: " + list);

        Collections.reverse(list);//reverse list
        out.println("Reversed list: " + list);

        Collections.shuffle(list);//shuffle list
        out.println("Shuffle list: " + list);

        out.println("min: " + Collections.min(list));//find min element

        out.println("max: " + Collections.max(list));//find max element

        out.println("Element by index: " + list.get(0));//get element by index
    }
}
