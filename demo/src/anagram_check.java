import java.util.Scanner;

public class anagram_check{
    private static boolean isAnagram(String a, String b) {
        String aa = a.toLowerCase();        //to lowerCase
        char[] c = aa.toCharArray();        // convert to array of chars
        java.util.Arrays.sort(c);           // sort
        String newString = new String(c);   // convert to string

        String bb = b.toLowerCase();         //to lowerCase
        char[] cc = bb.toCharArray();        // convert to array of chars
        java.util.Arrays.sort(cc);           // sort
        String newString2 = new String(cc);  // convert to string

        return newString.equals(newString2); //if is anagram return true, else return false
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}