package _java.unidad6.teoría;

import java.util.Arrays;
import java.util.Scanner;

public class ProductoEscalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1, array2;
        array1 = new int[3];
        array2 = new int[3];
        int scalar = 0;

        System.out.println("Escribe 3 numeros: ");
        for (int i = 0; i < array2.length; i++) {
            int inputs = sc.nextInt();
            array1[i] = inputs;
        }
        
        System.out.println("Escribe otros 3 numeros: ");
        for (int i = 0; i < array2.length; i++) {
            int inputs = sc.nextInt();
            array2[i] = inputs;

            scalar += inputs * array1[i];
        }
        System.out.println("Producto escalar: " + Arrays.toString(array1) + " · " + Arrays.toString(array2) + " = " + scalar);
        sc.close();
    }
}
