package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();

        set.add("a");//adds one element
        set.add(1);

        Collections.addAll(set,"A", "B", "C");//adds multiple elements

        set.forEach(System.out::println);//print all list

        System.out.println("Size of list: " + set.size()); //print size of list

        System.out.println("Has element 'a': " + set.contains("a"));//if contains element - return true
        System.out.println("Empty: " + set.isEmpty());//if list no empty - return true

        set.remove(1);//remove element
        System.out.println("List after remove element '1': ");
        set.forEach(System.out::println);

        set.clear();//clear list
        System.out.println("Size of list after clears: " + set.size());

    }
}
