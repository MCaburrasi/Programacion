package _java.unidad0.teoría;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime tu nombre");
        String name = sc.next();

        System.out.println(num + " " + name);
        sc.close();
    }
}
