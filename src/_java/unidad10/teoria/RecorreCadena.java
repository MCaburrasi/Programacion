package _java.unidad10.teoria;

import java.util.Scanner;

public class RecorreCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int i = 0;

        try {
            while (true) {
                System.out.println(string.charAt(i));
                i++;
            }
        } catch (Exception e) {
            System.out.println("Fin de la cadena");
        }
    }
}
