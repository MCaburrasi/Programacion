package _java.entrega;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimosDeRiesgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long iterations = sc.nextLong();
        for (int i = 0; i < iterations; i++) {
            boolean prime;
            int inputNum = 0;
            String input = sc.next();
            int j = 0;
            do {
                char nextChar = input.charAt(j);
                inputNum = inputNum + (int)nextChar;
                j++;
            } while (j < input.length());

            BigInteger letter = BigInteger.valueOf(inputNum);
            do {
                letter = letter.subtract(BigInteger.ONE);
                prime = letter.isProbablePrime(10);
                if(prime)
                    System.out.println(letter);
            } while (!prime);      
        }
        sc.close();
    }
}