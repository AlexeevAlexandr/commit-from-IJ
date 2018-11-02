import java.util.Arrays;

import static java.lang.Math.abs;

public class AAA {
    private static int[] gradingStudents(int[] grades) {
        int [] q = new int[grades[0]];
        for (int i = 0; i < grades[0]; i++) {
            int d = grades[i + 1];
            if (d < 38) {
                q[i] = d;
            } else {
                int b = abs((d % 5) - 5);
                if (b < 3) {
                    q[i] = d + b;
                } else {
                    q[i] = d;
                }
            }
        }
        return q;
    }
    public static void main(String[] args) {
        int [] a = {4,73,67,38,33};
        System.out.println(Arrays.toString(AAA.gradingStudents(a)));
    }
}
