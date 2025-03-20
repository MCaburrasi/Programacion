package _java.unidad0.teoría;
import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de mes: ");
        short mes = sc.nextShort();
        
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("el mes número " + mes + "mes");    
                break;
            default:
                break;
        }
        sc.close();
    }
}
