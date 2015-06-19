package jp.skypencil;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int i) {
        BigInteger value = BigInteger.ONE;
        for (int j = 2; j < i; ++j) {
            value = value.multiply(BigInteger.valueOf(j));
        }
        return value;
    }

}
