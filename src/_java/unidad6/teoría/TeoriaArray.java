package _java.unidad6.teoría;

import java.util.Arrays;
import java.util.Scanner;


public class TeoriaArray {
    public static void main(String[] args) {
        int alumnos = 0;
        int[] notas;
        double suma = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos hay en la clase?");
        alumnos = scanner.nextInt();
        notas = new int[alumnos];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota del alumno " + (i + 1) + ": ");
            int num = scanner.nextInt();
            notas[i] = num;
            suma += num;
        }
        System.out.println("Las notas son: " + Arrays.toString(notas));
        System.out.println("La media de la clase es: " + suma/notas.length);
        scanner.close();
    }
}
