import java.math.BigInteger;
/**
 * BigInteger to binaryString
 */
public class BigInteger_to_BinaryString {
    private static String toBitStr(BigInteger arg) {
        BigInteger myInt = new BigInteger(String.valueOf(arg));
        String binaryString = myInt.toString(2);
        return String.valueOf(binaryString);
    }

    public static void main(String[] args) {
        BigInteger k = new BigInteger("2");
        String expected = "10";
        String actual = BigInteger_to_BinaryString.toBitStr(k);

        System.out.println((!expected.equals(actual)) ?  "Test failed" : "Test OK");
    }
}