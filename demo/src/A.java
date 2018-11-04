import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {

    public static void main(String[] args) {

        String regex = " ";
        Pattern p = Pattern.compile(regex, Pattern.UNICODE_CASE);

        int numSentences = 1;

        while (numSentences-- > 0) {
            String input = "Goodbye bye bye world world world";
            List list = Arrays.asList(input.split(" "));

            list.stream().distinct();
            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
//                input = input.replaceAll(/* The regex to replace */, /* The replacement. */);
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

    }
}
