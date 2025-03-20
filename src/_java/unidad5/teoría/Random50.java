package _java.unidad5.teoría;

import java.util.Random;

public class Random50 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int max = 0;
        int min = 200;
        int numSum = 0;

        System.out.println("Random nums");
        for (int i = 0; i < 50; i++) {
            int randNum = rnd.nextInt(100) + 100;
            System.out.println(randNum);
            if (randNum > max)
                max = randNum;
            else if (randNum < min)
                min = randNum;

            numSum += randNum;        
        }
        System.out.println("Max, Min and Average");
        double average = numSum / 50;
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);

    }
}
