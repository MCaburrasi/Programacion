package _java.entrega;
import java.util.Scanner;

public class PiramideDeCanicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        for (int i = 0; i < iterations; i++) {
            int height = sc.nextInt();
            long marbels = 0;
            long lastRow = 0;
            for (int j = 1; j <= height; j++) {
                long row = lastRow + j;
                marbels += row;
                lastRow = row;
            }
            System.out.println(marbels);
        }
        sc.close();
    }
}