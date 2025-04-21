package _java.entrega;

import java.util.Scanner;

public class Escaleranos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stepNum;
        int k;
        while ((stepNum = sc.nextInt()) != 0){
            int distanceAmount = sc.nextInt();
            int[] stepPermutation = new int[stepNum + 1];
            int[] stepDistance = new int[distanceAmount];
            for (int i = 0; i < distanceAmount; i++) {
                stepDistance[i] = sc.nextInt();
            }

            stepPermutation[0] = 1;
            for (int i = 1; i <= stepNum; i++) {
                for (int j = 0; j < distanceAmount; j++) {
                    if ((k = i - stepDistance[j]) >= 0){
                        stepPermutation[i] += stepPermutation[k] % 1000000007;
                    }
                }
            }

            System.out.println(stepPermutation[stepNum]);
        }
    }
}
