package _java.febrero;

import java.math.BigInteger;
import java.util.Scanner;

public class PelotazoUrbanistico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger num1 = new BigInteger(sc.next());
            BigInteger num2 = new BigInteger(sc.next());
            BigInteger gcd = num1.gcd(num2);
            System.out.println(num1.multiply(num2).divide(gcd.pow(2)));
        }

    }
}
