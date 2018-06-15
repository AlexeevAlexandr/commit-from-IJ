package BigInteger.BigInteger2;

import java.math.BigInteger;
import java.util.Arrays;

public class PolyUtils {
    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
        BigInteger [] result = new BigInteger[x.length+y.length-1];
        BigInteger result2;
        if (x.length == 1){return y;}
        if (y.length == 1){return x;}
        if(result.length == 3){
                result[0] = x[0].multiply(y[0]);
                result[1] = (x[0].multiply(y[1])).add(x[1].multiply(y[0]));
                result[2] = x[1].multiply(y[1]);
        }
        if(x.length == 3 && y.length ==2){
            result[0] = x[0].multiply(y[0]);
            result[1] = (x[0].multiply(y[1])).add(x[1].multiply(y[0]));
            result[2] = (x[1].multiply(y[1])).add(x[2].multiply(y[0]));
            result[3] = x[2].multiply(y[0]);
        }
        if(x.length == 2 && y.length ==3) {
            result[0] = x[0].multiply(y[0]);
            result[1] = (x[0].multiply(y[1])).add(x[0].multiply(y[1]));
            result[2] = (x[1].multiply(y[2])).add(x[1].multiply(y[2]));
            result[3] = x[0].multiply(y[1]);
        }
        System.out.println(Arrays.toString(result));
        return  result;
    }
}

