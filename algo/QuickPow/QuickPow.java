package algo.QuickPow;

import java.math.BigInteger;


public class QuickPow {
    public static BigInteger paw(BigInteger x, BigInteger y, BigInteger n) {

        BigInteger res = BigInteger.ONE;
        while (y.compareTo(BigInteger.ZERO) > 0) {
            if(y.and(BigInteger.ONE).compareTo(BigInteger.ZERO) > 0) {
                res = res.multiply(x);
            }
            x = x.multiply(x);
            y = y.shiftRight(1);
        }
        return res.mod(n);
    }
}
