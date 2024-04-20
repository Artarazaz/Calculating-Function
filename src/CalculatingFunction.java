import java.math.BigInteger;
import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        BigInteger lastEven;
        BigInteger lastOdd;
        BigInteger even;
        BigInteger odd;

        if (n.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
            lastEven = n;
            lastOdd = n.subtract(BigInteger.ONE);
            even = n.divide(BigInteger.valueOf(2));
            odd = n.divide(BigInteger.valueOf(2));
        } else {
            lastEven = n.subtract(BigInteger.ONE);
            lastOdd = n;
            even = n.subtract(BigInteger.ONE).divide(BigInteger.valueOf(2));
            odd = n.add(BigInteger.ONE).divide(BigInteger.valueOf(2));
        }

        BigInteger result = (((lastEven.add(BigInteger.valueOf(2))).multiply(even)).divide(BigInteger.valueOf(2)))
                .add(((((lastOdd.add(BigInteger.ONE))).multiply(odd)).divide(BigInteger.valueOf(2))).negate());

        System.out.println(result);
    }
}