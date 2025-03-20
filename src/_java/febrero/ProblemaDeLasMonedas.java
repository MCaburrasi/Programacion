package _java.febrero;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemaDeLasMonedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int coinTypeAmount = sc.nextInt();

            long startTime = System.currentTimeMillis();
            int[] coinValue = new int[coinTypeAmount];
            for (int i = coinTypeAmount - 1; i >= 0; i--) {
                coinValue[i] = sc.nextInt();
            }
    
            int[] coinAmount = new int[coinTypeAmount];
            for (int i = coinTypeAmount - 1; i >= 0; i--) {
                coinAmount[i] = sc.nextInt();
            }
    
            int priceToPay = sc.nextInt();
            Map<Integer, int[]> map = new LinkedHashMap<>();
            for (int j = 0; j <= priceToPay; j++) {
                map.put(j, new int[coinTypeAmount + 1]);
            }
            
            for (int i = 1; i <= priceToPay; i++) {
                map.get(i)[0] = Integer.MAX_VALUE;
                int j = 1;
                int best = 0;
                int bestValue = Integer.MAX_VALUE;
    
                for (int coin : coinValue) {
                    if (i - coin >= 0) {
                        if (map.get(i - coin)[j] < coinAmount[j - 1]) {
                            if (map.get(i)[0] >= map.get(i - coin)[0] + 1) {
                                map.get(i)[0] = map.get(i - coin)[0] + 1;
                                best = j;
                                bestValue = coin;
                            }
                        }
                    }
                    j++;
                }
    
                if (i - bestValue >= 0) {
                    for (int j2 = 1; j2 <= coinTypeAmount; j2++) {
                        map.get(i)[j2] = map.get(i - bestValue)[j2];
                    }
                    map.get(i)[best] = map.get(i)[best] + 1;
                }
            }
            long endTime = System.currentTimeMillis();
            if (map.get(map.size() - 1)[0] < priceToPay && map.get(map.size() - 1)[0] > 0) {
                System.out.print("SI");
                for (int index = coinTypeAmount; index > 0; index--) {
                    System.out.print(" " + map.get(map.size() - 1)[index]);
                }
            } else
                System.out.print("NO");
            System.out.println();   
            System.out.println(endTime - startTime + "ms");
        }
        sc.close();
    }
}