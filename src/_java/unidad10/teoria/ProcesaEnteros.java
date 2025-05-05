package _java.unidad10.teoria;

import java.util.Scanner;

public class ProcesaEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");
        int total = 0;

        for (int i = 0; i < num.length; i++) {
            try {
                total += Integer.parseInt(num[i]);
            } catch (NumberFormatException _){}
        }

        System.out.println("La suma de enteros es: " + total);
    }
}
