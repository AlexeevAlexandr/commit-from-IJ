package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class People {

    private String name;
    private int age;
    private String sex;

    private People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {
        List<People> myList = Arrays.asList(
                new People("Vasia",16,"man"),
                new People("Katia",20,"woman")
        );

        myList.stream().filter(p -> p.sex)

    }
}
