package _java.febrero;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PlanificandoLasUvas {
    public static int count;

    public static void grape (List<Integer> grapes, int maxWeight, int grapeAmount, int index){
        for (int i = index; i < grapes.size(); i++) {
            int indGrape = grapes.get(i);
            if (grapeAmount + 1 == 12 && maxWeight - indGrape >= 0){
                count++;
            } else if (maxWeight - indGrape > 0){
                grapeAmount++;
                grape(grapes, maxWeight - grapes.get(i), grapeAmount, i + 1);
                grapeAmount--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int maxWeight = sc.nextInt();
            int grapeNum = sc.nextInt();
            if (maxWeight == 0 && grapeNum == 0)
                break;
            List<Integer> grapes = new LinkedList<>();
            for (int i = 0; i < grapeNum; i++) {
                grapes.add(sc.nextInt());
            }
            count = 0;
            Collections.sort(grapes, Collections.reverseOrder());
            //long start = System.currentTimeMillis();
            grape(grapes, maxWeight, 0, 0);
            //long end = System.currentTimeMillis();
        }
    }
}
