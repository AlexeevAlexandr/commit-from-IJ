import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UsernameValidator {

    static final String regularExpression = "^\\D(\\w*){8,}";
}
public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            System.out.println(userName);
            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
class z{
    public static void main(String[] args) {
        String a = "JuliaZ007";
        Pattern p = Pattern.compile("^\\D(\\w*?){8,}");
        Matcher m = p.matcher(a);
        System.out.println(m.matches());
    }
}