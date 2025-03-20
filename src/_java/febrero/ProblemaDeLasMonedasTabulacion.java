package _java.febrero;

import java.util.Scanner;

public class ProblemaDeLasMonedasTabulacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int valueQuant = sc.nextInt();
            int[] coins = new int[valueQuant];
            for (int i = 0; i < coins.length; i++) {
                coins[i] = sc.nextInt();
            }

            int[] coinAmountO = new int[valueQuant];

            for (int i = 0; i < coinAmountO.length; i++) {
                coinAmountO[i] = sc.nextInt();
            }

            int priceToPay = sc.nextInt();
            int[] values = new int[priceToPay + 1];
            int[][] coinAmountF = new int[priceToPay + 1][valueQuant];
            
            for (int i = 1; i <= priceToPay; i++) {
                int min = 0;
                values[i] = Integer.MAX_VALUE;
                for (int j = 0; j < valueQuant; j++) {
                    if (i - coins[j] >= 0 && coinAmountO[j] > coinAmountF[i][j] * -1) {
                        if (values[i] > values[i - coins[j]] + 1)
                            min = j;
                        values[i] = Math.min(values[i], values[i - coins[j]] + 1);
                    }
                    if (values[i] != Integer.MAX_VALUE && values[i] != Integer.MIN_VALUE) {
                        for (int k = 0; j < coinAmountF[i].length; k++) {
                            coinAmountF[i][k] = coinAmountF[i - coins[min]][k];
                        }
                        coinAmountF[i][min] = coinAmountF[i][min] - 1;
                    }
                }
            }

            if (values[values.length - 1] != Integer.MAX_VALUE && values[values.length - 1] != Integer.MIN_VALUE) {
                System.out.print("SI");
                for (int index = 0; index < coinAmountF[0].length; index++) {
                    System.out.print(" " + coinAmountF[coinAmountF.length - 1][index] * -1);
                }
            } else
                System.out.print("NO");
            System.out.println();
        }
        
        sc.close();
    }
}