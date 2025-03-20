package _java.entrega;
import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int height;
        do {
            int ax = sc.nextInt();
            int ay = sc.nextInt();
            int bx = sc.nextInt();
            int by = sc.nextInt();
            base = bx - ax;
            height = by - ay;
            if (base >= 0 && height >= 0) {
                int area;
                area = base * height;
                System.out.println(area);
                    }    
        } while (base >= 0 && height >= 0);   
        sc.close();
    }
}


