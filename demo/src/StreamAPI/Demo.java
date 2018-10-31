package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a3","a1","a2","a2","a8");

        System.out.println(Arrays.stream(Arrays.toString(list.stream().mapToInt(a -> Integer.parseInt(a.substring(1))).toArray()).replaceAll("[\\[\\] ]","").split(",")).mapToInt(Integer::parseInt).sum());
    }
}
