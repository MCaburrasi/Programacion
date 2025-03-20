package _java.entrega;
import java.util.Scanner;

public class La1314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < iterations; i++) {
            String wrench = sc.nextLine();
            int hyphenPosition = wrench.indexOf('-');
            char firstlastdigit = wrench.charAt(hyphenPosition-1);
            char lastlastdigit = wrench.charAt(wrench.length()-1);

            if (firstlastdigit >= lastlastdigit && lastlastdigit % 2 == 0 && lastlastdigit == firstlastdigit - 1)
                System.out.println("SI");
            else if (firstlastdigit <= lastlastdigit && firstlastdigit % 2 == 0 && firstlastdigit == lastlastdigit - 1)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}