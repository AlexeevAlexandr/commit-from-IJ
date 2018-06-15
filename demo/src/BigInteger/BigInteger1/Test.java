package BigInteger.BigInteger1;

import BigInteger.BigInteger1.BigInteger_Polynom;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("1"),
                new BigInteger("1")
        };
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("2");
        BigInteger actual = BigInteger_Polynom.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test2 {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("1"),
                new BigInteger("0")
        };
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("1");
        BigInteger actual = BigInteger_Polynom.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test3 {
    public static void main(String[] args) {
        BigInteger[] poly = {
                new BigInteger("-4"),
                new BigInteger("0"),
                new BigInteger("-10"),
                new BigInteger("100")
        };
        BigInteger arg = new BigInteger("2");
        BigInteger expected = new BigInteger("48"); // (-4)*2*2*2 + 0*2*2 + (-10)*2 + 100
        BigInteger actual = BigInteger_Polynom.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test4 {
    public static void main(String[] args) {
        BigInteger[] poly = {new BigInteger("1")};
        BigInteger arg = new BigInteger("1");
        BigInteger expected = new BigInteger("1");
        BigInteger actual = BigInteger_Polynom.eval(poly, arg);

        if (!expected.equals(actual)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
