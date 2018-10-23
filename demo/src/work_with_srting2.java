import java.util.Scanner;

public class work_with_srting2 {
    public static void main(String[] args) {
        char q,w;
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        A= A.substring(0,1).toUpperCase() + A.substring(1);//uppercase first char in string
        B= B.substring(0,1).toUpperCase() + B.substring(1);

        q=A.charAt(0);
        w=B.charAt(0);

        System.out.println((A.length())+(B.length()));
        System.out.println((q>w)? "Yes" : "No");
        System.out.println(A+" "+B);

        sc.close();
    }
}