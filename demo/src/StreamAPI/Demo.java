package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a3","a1","a2","a2","a8");

        System.out.println(Arrays.stream(Arrays.toString(list.stream().mapToInt(a -> Integer.parseInt(a.substring(1))).toArray()).replaceAll("[\\[\\] ]","").split(",")).mapToInt(Integer::parseInt).sum());
        list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
        System.out.println(list.stream().max(String::compareTo).get());
        System.out.println(list.stream().min(String::compareTo).get());

        String [] str = {"1","2","3"};
        int [] ints = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        for(int c : ints){
            System.out.println(c);
        }
    }
}
