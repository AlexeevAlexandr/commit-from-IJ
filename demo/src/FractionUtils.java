import java.math.BigInteger;
import java.util.Arrays;

class FractionUtils {
    static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {
        BigInteger[] result = new BigInteger[]{new BigInteger("0"), new BigInteger("1")};
        BigInteger biginteger = lcm(x[1], y[1]);
        BigInteger numerator = x[0].multiply(biginteger.divide(x[1])).add(y[0].multiply(biginteger.divide(y[1])));

        if ( result[0].compareTo(numerator) == 0 ) {
            return result;
        }
        BigInteger gcdBigInteger = numerator.gcd(biginteger);

        result[0] = numerator.divide(gcdBigInteger);
        result[1] = biginteger.divide(gcdBigInteger);
        return result;
    }

    private static BigInteger lcm(BigInteger a, BigInteger b) {
        return (a.divide(b.gcd(a))).multiply(b);
    }
}
class test {
    public static void main(String[] args) {
        BigInteger[] x = {new BigInteger("1"), new BigInteger("2")};
        BigInteger[] y = {new BigInteger("-1"), new BigInteger("3")};
        BigInteger[] expected = {new BigInteger("1"), new BigInteger("6")};
        BigInteger[] actual = FractionUtils.sum(x, y);

        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}