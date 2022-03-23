package Task13;

import java.math.BigInteger;

public class Task13 {
    public static void main(String[] args) {
        var result = BigInteger.ONE;
        var i = 1;
        do {
            final var x = BigInteger.valueOf(i);
            result = result.multiply(x);
            i++;
        } while (i <= 25);
        System.out.println("Произведение чисел от 1 до 25 = "+result);
    }
}
