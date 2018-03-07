import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        double tip_percent = in.nextDouble();
        double tax_percent = in.nextDouble();
        in.close();

        double q = (meal_cost*(tip_percent/100));
        double w = (meal_cost*(tax_percent/100));
        double t = (meal_cost+q+w);
        System.out.println("The total meal cost is "+(Math.round(t))+ " dollars.");
    }
}
