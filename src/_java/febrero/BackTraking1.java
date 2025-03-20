package _java.febrero;

import java.util.Scanner;

public class BackTraking1 {
    public static int counter (int num) {
        int amount = 0;
        for (int i = num; i >= 1; i--) {
            if (num - i > 0)
                amount += counter(num - i);
            else
                amount += 1;
        }
        return amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(counter(num));
    }
}
