package _java.unidad10.teoria.excepciones;

import java.util.Scanner;

public class PruebaFactorial {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner sc = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y")){
                System.out.println("Enter an integer: ");
                int val = sc.nextInt();
            try {
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Another factorial? (y/n) ");
            keepGoing = sc.next();
        }
    }
}
