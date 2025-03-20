package _java.unidad5.teoría;
import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("987654321098765432109876543210");
        BigInteger num2 = new BigInteger("012345678901234567890123456789");

        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);
        BigInteger gcd = num1.gcd(num2);

        System.out.println("Suma: " + sum);
        System.out.println("Producto: " + product);
        System.out.println("MCD: " + gcd);

    }
}
