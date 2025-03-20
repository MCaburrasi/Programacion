package _java.unidad0.actividades;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        final int MAX_NUMBER = 20;
        final int MAXTRIES = 6;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int randNum = random.nextInt(MAX_NUMBER) + 1;
        int tries = 0;
        int input = 0;

        do {
            System.out.println("Adivina");
            input = sc.nextInt();
            if (input > randNum) {
                System.out.println("Es muy alto");
            } else if (input < randNum) {
                System.out.println("Es muy bajo");
            }
            tries ++;
        } while (input != randNum && tries <= MAXTRIES - 1);
        
        System.out.println("Buen trabajo, has adivinado en " + tries + " intentos!");
        sc.close();
    }
}