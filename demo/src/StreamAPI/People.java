package StreamAPI;

import javafx.print.Collation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class People {
    private String name;
    private int age;
    private String sex;

    private People(){}

    private People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private String getName(){

        return name;
    }

    private int getAge() {
        return age;
    }

    private String getSex() {
        return sex;
    }

    @Override
    public String toString(){
        return "\nName = " + getName() +
                "\nAge = " + getAge() +
                "\nSex = " + getSex() + "\n";
    }

    private long getNuberOfPeoplesBetween18_27(List<People> myList){
        return myList.stream().filter(a ->
                a.getAge()>=18 &&
                        a.getAge()<27 &&
                        a.getSex().equals("man"))
                .count();
    }

    private List<People> getListOfPeoplesBetween18_27(List<People> myList){
        return myList.stream().filter(p ->
                        p.getAge()>=18 &&
                        p.getAge()<27 &&
                        p.getSex().equals("man"))
                .collect(Collectors.toList());
    }

    private double getAverageAge(List<People> myList){
        return myList.stream().filter(b ->
                b.getSex().equals("man"))
                .mapToDouble(People::getAge).average().getAsDouble();
    }

    private long getNumberOfWorkAblePeoples(List<People> myList){
        return myList.stream()
                .filter(p -> p.getAge()>=18)
                .filter(p -> (p.getSex().equals("woman") && getAge()<55) || (p.getSex().equals("man") && getAge()<60))
                .count();
    }

    private List<People> sortedByName(List<People> myList){
        return myList.stream().sorted(Comparator.comparing(People::getName)).collect(Collectors.toList());
    }

    private List<People> sortedBySex(List<People> myList){
        return myList.stream().sorted(Comparator.comparing(People::getSex)).collect(Collectors.toList());
    }

    private List<People> sortedByAge(List<People> myList){
        return myList.stream().sorted(Comparator.comparing(People::getAge)).collect(Collectors.toList());
    }

    private List<People> getListOfWorkAblePeoples(List<People> myList){
        return myList.stream()
                .filter(p -> p.getAge()>=18)
                .filter(p -> (p.getSex().equals("woman") && getAge()<55) || (p.getSex().equals("man") && getAge()<60))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<People> myList = Arrays.asList(
                new People("Olag",16,"man"),
                new People("Katya",16,"woman"),
                new People("Peta",18,"man"),
                new People("Anton",22,"man"),
                new People("Lida",45,"woman"),
                new People("Ivan",40,"man"),
                new People("Kolia",75,"man"),
                new People("Tonia",18,"woman"),
                new People("Karina",20,"woman"),
                new People("Vera",70,"woman")
        );
        People people = new People();
        System.out.println(people.getNuberOfPeoplesBetween18_27(myList));
        people.getListOfPeoplesBetween18_27(myList).forEach(System.out::print);
        System.out.println(people.getAverageAge(myList));
        System.out.println(people.getNumberOfWorkAblePeoples(myList));
        people.getListOfWorkAblePeoples(myList).forEach(System.out::println);
        people.sortedByName(myList).forEach(System.out::println);
        people.sortedBySex(myList).forEach(System.out::println);
        people.sortedByAge(myList).forEach(System.out::println);
    }
}
