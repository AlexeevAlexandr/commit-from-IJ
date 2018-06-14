import java.math.BigInteger;

public class PolyUtils {
    private static BigInteger result = BigInteger.valueOf(0);
    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        BigInteger [] z = new BigInteger[poly.length];
        if (poly.length == 0){return poly[0];
        }else{
                int a = Integer.parseInt(String.valueOf(arg));
                for (int i = 0; i < poly.length; i++) {
                    for (int j = 0; j <= i; j++) {
                        z[i] = poly[0].multiply(arg);

                    }
                }
            for (int i = 0; i < poly.length; i++) {
                result = result.add(z[i]);
                }
            }
        return result;
    }
}
class Test {
    public static void main(String[] args) {
        BigInteger[] poly = {new BigInteger("10")};
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("10");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test2 {
    public static void main(String[] args) {
        BigInteger[] poly = {new BigInteger("1")};
        BigInteger arg = new BigInteger("10");
        BigInteger expected = new BigInteger("1");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test3 {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("1"),
                new BigInteger("1")
        };
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("2");
        BigInteger actual = PolyUtils.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}