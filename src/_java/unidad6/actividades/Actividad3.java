package _java.unidad6.actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = new char[20];
        int aQuant = 0;
        for (int i = 0; i < array.length; i++) {
            char letter = sc.next().charAt(0);
            array[i] = letter;
            if (letter == 'a'){
                aQuant++;
            }
        }
        int[] aPos = new int[aQuant];
        for (int j = 0; j < array.length; j++) {
            if (array[j] == 'a') {
                aPos[j] = j;
            }
        }
        System.out.println("Hay " + aQuant + "a, en las posiciones: " + Arrays.toString(aPos));
        sc.close();
    }
}
