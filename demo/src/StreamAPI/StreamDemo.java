package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "reb1", "c2", "forest");

//        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
//        System.out.println(myList.stream().filter("a1"::equals).count());//prints the number of matches
//        myList.stream().sorted().forEach(System.out::println);// prints sorted list
//        myList.stream().filter(s -> s.startsWith("1",1)).forEach(System.out::print);
        System.out.println(myList.stream().findAny());
    }
}
