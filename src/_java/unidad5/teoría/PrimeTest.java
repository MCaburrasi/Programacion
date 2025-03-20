package _java.unidad5.teoría;

import java.math.BigInteger;

public class PrimeTest {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("104729");
        int certainty = 10;

        if (bigInt.isProbablePrime(certainty)){
            System.out.println(bigInt + " es probablemente primo.");
        } else {
            System.out.println(bigInt + " no es primo");
        }

    }
}
