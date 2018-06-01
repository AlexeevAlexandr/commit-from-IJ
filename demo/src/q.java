class Person {
    private String firstName;
    private String lastName;
    private int idNumber;
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}
class Student extends Person{
    private int s,ss;
    Student(String heraldo, String memeli, int i, int[] testScores) {
        super(heraldo,memeli,i);
        for(int a : testScores){
            ss+=a;
        }
        s=(ss)/testScores.length;
    }
    char calculate() {
        char a=' ';
        if(s>=90 && s<=100){a='O';}
        if(s>=80 && s<90){a='E';}
        if(s>=70 && s<80){a='A';}
        if(s>=55 && s<70){a='P';}
        if(s>=40 && s<55){a='D';}
        if(s<40){a='T';}
        return a;
    }
}
class Solution {
    public static void main(String[] args) {
        int[] testScores = {100,80};
        Student s = new Student("Heraldo", "Memeli", 8135627, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}