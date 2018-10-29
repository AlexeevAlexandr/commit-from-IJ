package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("1","b1","ee1w2","a1","s1","s12s");

        myList.stream().reduce((s1,s2) -> s1 + s2).orElse("0");
        myList.forEach(System.out::println);
    }
}
