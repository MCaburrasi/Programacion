package _java.entrega;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DiseminacionDeLuces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = 1;
        while (cases != 0) {
            cases = sc.nextInt();
            if (cases == 0) {
                break;
            }

            long disemination = 0;
            Map<Integer, int[]> map = new HashMap<>();
            for (int i = 0; i < cases; i++) {
                int ledStripLed = sc.nextInt();
                if (!map.containsKey(ledStripLed))
                    map.put(ledStripLed, new int[]{i, i});
                else
                    map.get(ledStripLed)[1] = i;
            }
            
            Iterator<Map.Entry<Integer, int[]>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, int[]> entry = iterator.next();
                disemination += entry.getValue()[1] - entry.getValue()[0];
            }
            System.out.println(disemination);
        }
        sc.close();
    }
}
