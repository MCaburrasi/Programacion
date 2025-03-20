package _java.unidad6.actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int i = 0;
        while (i < array.length) {
            System.out.print("Numero " + (i + 1) + ": ");
            int num = sc.nextInt();
            if (num >= 0)
                System.out.println("Numero no valido, ingrese un numero negativo");
            else {
                array[i] = num;
                i++;
            } 
        }
        System.out.println("Vector: " + Arrays.toString(array));
        sc.close();
    }
}
