package _java.unidad6.actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int[] numbers = new int[5];
        int[] position = new int[5];
        Arrays.fill(position, -1);
        boolean valid;
        boolean validPos;

        do {
            valid = true;
            for (int i = 0; i < numbers.length; i++) {
                int num = sc.nextInt();
                numbers[i] = num;
                if (num < 0)
                    valid = false;}
            if (!valid) {
                System.out.println("Numeros incorrectos, todos los numeros tienen que ser positivos");
            }
        } while (!valid);

        do {
            validPos = true;
            for (int i = 0; i < numbers.length; i++) {
                int num = sc.nextInt();
                for (int j : position) {
                    if (num == j)
                        validPos = false;
                }
                position[i] = num;
                
            }
            if (!validPos) {
                System.out.println("Posiciones incorrectas, todos los numeros tienen que ser únicos");
            }
        } while (!validPos);

        for (int i = 0; i < position.length; i++) {
            array[position[i]] = numbers[i];
        }
        System.out.println("Array: " + Arrays.toString(array));
        sc.close();
    }
}