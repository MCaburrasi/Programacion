package _java.unidad10.actividades.relacion3;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        try {
            System.out.println("The month " + months[num - 1] + " has " + dom[num - 1] + " days.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The month number " + num + " does not exist");
        }
    }
}
