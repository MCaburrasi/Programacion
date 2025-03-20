package _java.unidad0.teoría;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad: ");
        byte edad = sc.nextByte();

        if (edad >= 18){
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }
        sc.close();
    }
}
