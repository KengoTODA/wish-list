package jp.skypencil;

import java.math.BigInteger;

public class Fibonacci {
    static BigInteger fibonacci(int i) {
        i -= 2;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int j = 0; j < i; j++) {
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        return b;
    }
}
