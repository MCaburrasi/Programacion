package _java.unidad0.teoría;
import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        
        while (num != 0) {
            System.out.println("Pulse 0 para salir");
            num = sc.nextInt();
        }
        sc.close();
    }   
}