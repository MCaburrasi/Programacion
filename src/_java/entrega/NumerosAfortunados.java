package _java.entrega;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class NumerosAfortunados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        while (number != 0) {
            int j = 2;
            number = sc.nextInt();
            if (number == 0)
                break;
            
            
            Deque<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= number; i++) {
                queue.offer(i);
            }
            while (j <= queue.size()) {
                int queueSize = queue.size();
                int i = 0;
                do {
                    int num = queue.removeFirst();
                    if (i % j != 0) 
                        queue.offer(num);
                    i++;
                } while (i < queueSize);
                j++;
            }
            
            System.out.print(number + ":");
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int numToPrint = queue.pollLast();
                System.out.print(" " + numToPrint);
            }
            System.out.println();
        }
        sc.close();
    }
}