package _java.febrero;

import java.util.Scanner;

public class CuadradosDiabolicos {

    public static int magicValueRow (int[] row) {
        int magicConst = 0;
        for (int j : row) {
            magicConst += j;
        }
        return magicConst;
    }

    public static int magicValueColumn (int[][] square, int index){
        int magicConst = 0;
        for (int i = 0; i < square.length; i++) {
            magicConst += square[index][i];
        }
        return magicConst;
    }

    public  static boolean magicValueDiags (int[][] square, int magicNum){
        int mainDiag = 0;
        int altDiag = 0;
        for (int i = 0; i < square.length; i++) {
            mainDiag += square[i][i];
            altDiag += square[i][square.length - 1 - i];
        }
        return mainDiag == magicNum && altDiag == magicNum;
    }

    public static boolean isDiabolic (int[][] square){
        boolean diabolic = true;
        int magicNum = magicValueRow(square[0]);
        for (int i = 0; i < square.length; i++) {
            if (magicNum != magicValueRow(square[i]) || magicValueColumn(square, i) != magicNum) {
                diabolic = false;
                break;
            }
        }
        if (!magicValueDiags(square, magicNum))
            diabolic = false;

        return diabolic;
    }

    public static boolean secondRule (int magicConst, int[][] square, int n){
        int magicConst2 = 4 * magicConst / n;
        return (square[0][0] +
                square[0][square.length - 1] +
                square[square.length - 1][square.length - 1] +
                square[square.length - 1][0] == magicConst2);
    }

    public static boolean thirdFourthRule (int magicConst, int[][] square, int n) {
        int magicConst2 = 4 * magicConst / n;
        boolean result;
        if (n % 2 == 0) {
            result = square[0][n/2 - 1] +
                     square[0][n/2] +
                     square[n/2 - 1][0] +
                     square[n/2 - 1][square.length - 1] +
                     square[n/2][0] +
                     square[n/2][square.length - 1] +
                     square[square.length - 1][n/2 - 1] +
                     square[square.length - 1][n/2] == magicConst2 * 2 &&
                     square[n/2 - 1][n/2 - 1] +
                     square[n/2 - 1][n/2] +
                     square[n/2][n/2 - 1] +
                     square[n/2][n/2] == magicConst2;
        } else {
            result = square[0][n/2] +
                     square[square.length - 1][n/2] +
                     square[n/2][0] +
                     square[n/2][square.length - 1] == magicConst2 &&
                     square[n/2][n/2] * 4 == magicConst2;
        }
        return result;
    }

    public static boolean isEsoteric (int magicConst, int[][] square, int n, boolean firstRule) {
        return isDiabolic(square) &&
               firstRule &&
               secondRule(magicConst, square, n) &&
               thirdFourthRule(magicConst, square, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n != 0) {
            boolean firstRule = true;
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[][] square = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    square[i][j] = sc.nextInt();
                    if (square[i][j] > Math.pow(n, 2) || square[i][j] < 0)
                        firstRule = false;
                }
            }
            int magicConst = magicValueRow(square[0]);
            if (isEsoteric(magicConst, square, n, firstRule))
                System.out.println("ESOTERICO");
            else if (isDiabolic(square))
                System.out.println("DIABOLICO");
            else
                System.out.println("NO");
        }
    }
}
