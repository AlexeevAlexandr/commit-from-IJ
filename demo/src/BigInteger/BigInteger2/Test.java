package BigInteger.BigInteger2;

import java.math.BigInteger;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BigInteger[] x = {new BigInteger("1")};
        BigInteger[] y = {new BigInteger("1")};
        BigInteger[] expected = {new BigInteger("1")};
        BigInteger[] actual = PolyUtils.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test1 {
    public static void main(String[] args) {
        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("2"),
                new BigInteger("1"),
        };
        BigInteger[] actual = PolyUtils.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError(Arrays.toString(actual));
        }

        System.out.print("OK");
    }
}
class Test2 {
    public static void main(String[] args) {
        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] actual = PolyUtils.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError(Arrays.toString(actual));
        }

        System.out.print("OK");
    }
}
class Test3 {
    public static void main(String[] args) {
        BigInteger[] x = {
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] actual = PolyUtils.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError(Arrays.toString(actual));
        }

        System.out.print("OK");
    }
}
class Test4 {
    public static void main(String[] args) {
        BigInteger[] x = {new BigInteger("1")};
        BigInteger[] y = {new BigInteger("1")};

        BigInteger[] expected = {new BigInteger("1")};
        BigInteger[] actual = PolyUtils.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test5 {
    public static void main(String[] args) {
        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("0"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("1"),
                new BigInteger("0"),
        };
        BigInteger[] actual = PolyUtils.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError(Arrays.toString(actual));
        }

        System.out.print("OK");
    }
}
class Test6 {
    public static void main(String[] args) {
        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("2"),
        };
        BigInteger[] y = {
                new BigInteger("3"),
                new BigInteger("4"),
        };

        BigInteger[] expected = {
                new BigInteger("3"),
                new BigInteger("10"),
                new BigInteger("8"),
        };
        BigInteger[] actual = PolyUtils.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test7 {
    public static void main(String[] args) {
        BigInteger[] x = {
                new BigInteger("3"),
                new BigInteger("4"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("2"),
        };

        BigInteger[] expected = {
                new BigInteger("3"),
                new BigInteger("10"),
                new BigInteger("8"),
        };
        BigInteger[] actual = PolyUtils.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test8 {
    public static void main(String[] args) {
        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("2"),
                new BigInteger("2"),
                new BigInteger("1"),
        };
        BigInteger[] actual = PolyUtils.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
class Test9 {
    public static void main(String[] args) {
        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("2"),
                new BigInteger("2"),
                new BigInteger("1"),
        };
        BigInteger[] actual = PolyUtils.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}