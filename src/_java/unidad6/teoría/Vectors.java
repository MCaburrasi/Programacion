package _java.unidad6.teoría;

import java.util.Arrays;

public class Vectors {
    public static boolean contains(int[] vector, int key){
        boolean result = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == key) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int search(int[] vector, int key){
        int index = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static boolean areEqual(int[] vector1, int[] vector2){
        boolean result = false;
        if (vector1.length == vector2.length){
            result = true;
            for (int i = 0; i < vector2.length; i++) {
                if (vector1[i] != vector2[i]){
                    result = false;
                    break;
                }

            }
        }
        return result;
    }

    public static int[] copyOf(int[] vector){
        int[] vectorCopy = new int[vector.length];
        for (int i = 0; i < vector.length; i++)
            vectorCopy[i] = vector[i];
        
        return vectorCopy;
    }

    public static int[] copyOf(int[] vector, int size){
        int[] vectorCopy = new int[size];
        int smallSize;
        if (size > vector.length)
            smallSize = vector.length;
        else
            smallSize = size;

        for (int i = 0; i < smallSize; i++)
            vectorCopy[i] = vector[i];

        return vectorCopy;
    }

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4};
        int[] vector2 = {1, 2, 3, 4};

        boolean result = contains(vector, 0);
        System.out.println(result);

        int index = search(vector, 3);
        System.out.println(index);

        boolean equals = areEqual(vector, vector2);
        System.out.println(equals);

        int[] vectorCopy = copyOf(vector);
        System.out.println(Arrays.toString(vectorCopy));

        int[] vectorCopySmaller = copyOf(vector, 2);
        int[] vectorCopyBigger = copyOf(vector, 8);
        System.out.println(Arrays.toString(vectorCopySmaller));
        System.out.println(Arrays.toString(vectorCopyBigger));
    }
}
