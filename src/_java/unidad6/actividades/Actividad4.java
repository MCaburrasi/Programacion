package _java.unidad6.actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = new char[10];
        System.out.println("Escribe 10 letras");
        for (int i = 0; i < array.length; i++) {
            char letter = sc.next().charAt(0);
            array[array.length - 1 - i] = letter;
        }
        System.out.println("Array inverso: " + Arrays.toString(array));
        sc.close();
    }
}
