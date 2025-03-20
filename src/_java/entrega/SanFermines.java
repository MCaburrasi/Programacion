package _java.entrega;
import java.util.Scanner;

public class SanFermines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        while (scan.hasNext()) {
            int bullNumber = scan.nextInt();
            int fastestBull = 0;
            for (int i = 0; i < bullNumber; i++) {
                int nextBull = scan.nextInt();
                if(nextBull > fastestBull){
                    fastestBull = nextBull;
                }
            }
            System.out.println (fastestBull);
        }   
        scan.close();
    }
}