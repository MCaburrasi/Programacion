package _java.unidad6.teoría;

import java.util.Arrays;

public class Matrix {
    public static int[][] add(int[][] m1, int[][] m2){
        return null;
    }

    public static int[][] subtract(int[][] m1, int[][] m2){
        return null;
    }

    public static int[][] multiply(int[][] m1, int[][] m2){
        return null;
    }

    public static void main(String[] args) {
        int[][] m1, m2;
        m1 = new int[3][3];
        m2 = new int[3][3];

        int[][] sum = add(m1, m2);
        int[][] result = subtract(m1, m2);
        int[][] product = multiply(m1, m2);

        System.out.println(Arrays.toString(sum));
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(product));
    }
}