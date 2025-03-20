package _java.unidad0.teoría;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        final int MIN = 36;
        final int MAX = 54;
        Scanner sc = new Scanner(System.in);
        System.out.println("Talla: ");
        int talla = sc.nextInt();
        if (MIN <= talla && talla <= MAX) {
            System.out.println("Talla existente");
        } else {
            System.out.println("Talla no existe");
        }
        sc.close();
    }
}
