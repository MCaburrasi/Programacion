package _java.unidad6.teoría;

import java.util.Arrays;

public class TeoriaEjemplosArrays {
    public static void main(String[] args) {
        //Ejemplo de fill() - Rellena un Array con un dato
        int[] numbers = new int[10];
        Arrays.fill(numbers, 5);
        System.out.println("Array después de fill(): " + Arrays.toString(numbers));

        //Ejemplo de sort() - Ordenar un array
        int[] disorderedNumbers = {9, 3, 5, 2, 8, 6, 1, 7, 10, 4};
        Arrays.sort(disorderedNumbers);
        System.out.println("Array después de sort(): " + Arrays.toString(disorderedNumbers));

        //Ejemplo de equals() - Comparar dos arrays
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 3, 5};

        System.out.println("¿array1 y array2 son iguales? " + Arrays.equals(array1, array2));
        System.out.println("¿array1 y array3 son iguales? " + Arrays.equals(array1, array3));

        //Ejemplo de binarySearch() - Busqueda binaria
        int[] orderedNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(orderedNumbers, 5);
        System.out.println("Índice de 5 en el array: " + index);

        //Ejemplo de copyOfRange() - Copia el rango de un array
        int[] copy = Arrays.copyOfRange(orderedNumbers, 2, 7);
        System.out.println("Copia del rango 2-6: " + Arrays.toString(copy));
    }
}
