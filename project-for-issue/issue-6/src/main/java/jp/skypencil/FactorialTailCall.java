package jp.skypencil;
import java.math.BigInteger;

class FactorialTailCall {
    private static BigInteger decrement(BigInteger number) {
        return number.subtract(BigInteger.ONE);
    }

    private static BigInteger multiply(BigInteger first, BigInteger second) {
        return first.multiply(second);
    }

    private static TailCall<BigInteger> factorialTailRec(BigInteger factorial,
            BigInteger number) {
        if (number.equals(BigInteger.ONE)) {
            return TailCalls.done(factorial);
        } else {
            return TailCalls.call(() -> factorialTailRec(
                    multiply(factorial, number), decrement(number)));
        }
    }

    static BigInteger factorial(long number) {
        return factorialTailRec(BigInteger.ONE, BigInteger.valueOf(number))
                .invoke();
    }
}
