package _java.unidad5.teoría;

import java.util.Random;

public class CaraoCruz {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean coin = rnd.nextBoolean();
        if (coin)
            System.out.println("Cara");
        else
            System.out.println("Cruz");
    }
}
