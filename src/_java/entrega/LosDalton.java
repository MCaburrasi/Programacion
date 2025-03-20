package _java.entrega;
import java.util.Scanner;
public class LosDalton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long daltonNumber;
        long daltonNumberCopy;

        do {
            boolean isDaltonUp = true;
            boolean isDaltonDown = true;
            daltonNumber = sc.nextLong();
            daltonNumberCopy = daltonNumber;

            if (daltonNumber != 0) {
                long lastDalton = sc.nextLong();
                while ((daltonNumber - 1) != 0) {
                    long dalton = sc.nextLong();
                    
                    if (dalton <= lastDalton){
                        isDaltonUp = false;
                    }

                    if (dalton >= lastDalton){
                        isDaltonDown = false;
                    }

                    lastDalton = dalton;
                    daltonNumber--;
                }

                if (isDaltonUp || isDaltonDown) {
                    System.out.println("DALTON");
                } else {
                    System.out.println("DESCONOCIDOS");
                }
            }

        } while (daltonNumberCopy != 0);
        sc.close();
    }
}