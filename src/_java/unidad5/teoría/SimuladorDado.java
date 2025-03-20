package _java.unidad5.teoría;
import java.util.Random;

public class SimuladorDado {
    public static void main(String[] args) {
        Random rnd = new Random();
        int dice = rnd.nextInt(6) + 1;
        System.out.println(dice);
    }
}
