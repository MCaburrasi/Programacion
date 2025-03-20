package _java.unidad6.actividades;

import java.util.Arrays;
import java.util.Random;

public class Actividad2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10) + 1;
        }
        System.out.println("Array: " + Arrays.toString(array));
    }
}
