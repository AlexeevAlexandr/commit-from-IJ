package BigInteger.BigInteger1;

import java.math.BigInteger;

/**
 * Реализовать вычисление полинома в точке,
 * то есть нам, скажем, дают полином f = 2*x*x*x - 3*x в виде [2, 0, -3, 0] и точку 100,
 * а мы должны вычислить 2*100*100*100 - 3*100 = 2000000 - 300 = 1999700
 */

public class BigInteger_Polynom {
    static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        BigInteger result = BigInteger.valueOf(0);
        BigInteger result2;
        if (poly.length == 1){result = poly[0];}
        else {
            for (int i = 0; i < poly.length - 1; i++) {
                result2 = BigInteger.valueOf(0);
                result2 = result2.add(poly[i]);
                for (int j = poly.length - 1; j > i; j--) {
                    result2 = result2.multiply(arg);
                }
                result = result.add(result2);
            }
            result = result.add(poly[poly.length - 1]);
        }
        return result;
    }
}
