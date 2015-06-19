package jp.skypencil;
import java.math.BigInteger;

public class FibonacciTailCall {
    static BigInteger fibonacci(int i) {
        if (i == 1) {
            return BigInteger.ONE;
        } else if (i == 2) {
            return BigInteger.ONE;
        } else {
            return fibTailRec(BigInteger.ONE, BigInteger.ONE, i - 3).invoke();
        }
    }

    private static TailCall<BigInteger> fibTailRec(BigInteger a, BigInteger b,
            int rest) {
        BigInteger next = a.add(b);
        if (rest == 0) {
            return TailCalls.done(next);
        } else {
            return TailCalls.call(() -> fibTailRec(b, next, rest - 1));
        }
    }
}
