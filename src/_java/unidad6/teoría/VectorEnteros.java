package _java.unidad6.teoría;

import java.util.Scanner;

public class VectorEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del array: ");
        int arraySize = sc.nextInt();
        int[] array;
        int smallNumber = Integer.MAX_VALUE;
        int bigNumber = Integer.MIN_VALUE;
        array = new int[arraySize];
        System.out.println("Numeros del array: ");
        for (int i = 0; i < array.length; i++) {
            int num = sc.nextInt();
            array[i] = num;

            if (num > bigNumber)
                bigNumber = num;
            if (num < smallNumber)
                smallNumber = num;
        }
        System.out.println("Min value: " + smallNumber);
        System.out.println("Max value: " + bigNumber);
        sc.close();
    }
}
