package _java.unidad0.teoría;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Introduce un número mayor que 100");
            num = keyboard.nextInt();
        } while (num <= 100);
        keyboard.close();
    }    
}
