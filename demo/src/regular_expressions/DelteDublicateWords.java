package regular_expressions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DelteDublicateWords {

    public static void main(String[] args) {

        //removing duplicate words
        String input = "Goodbye bye bye world world world";

        String result = Arrays.stream(input.split(" ")).distinct().collect(Collectors.toList()).toString().replaceAll("[\\[,\\]]","");

        StringBuilder result2 = new StringBuilder();
        Arrays.stream(input.split(" ")).distinct().collect(Collectors.toList()).forEach(a -> result2.append(a).append(" "));

        System.out.println(input);
        System.out.println(result);
        System.out.println(result2);
    }
}
