package _java.unidad6.teoría;

import java.util.Arrays;
import java.util.Scanner;

public class MiVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        int evens = 0;

        System.out.println("Escribe 5 numeros: ");
        for (int i = 0; i < vector.length; i++) {
            int num = sc.nextInt();
            vector[i] = num * 3;
        }

        System.out.println("Vector: " + Arrays.toString(vector));

        for (int num : vector) {
            if (num % 2 == 0){
                evens += num;
            }
        }
        System.out.println("Suma de numeros pares: " + evens);
        sc.close();
    }
}