package _java.entrega;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MichaelJFoxYElPatoDonald {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> dateSet = new HashSet<>();
        boolean first = true;
        long caseNumber = 0;
        long i;
        String date;
        boolean nonRepeatingDate = true;
        do {
            i = 0;
            if (!first) {
                while (i < caseNumber) {
                    date = sc.next();
                    nonRepeatingDate = dateSet.add(date.substring(0, date.length() - 5));
                    i++;
                    if (!nonRepeatingDate) {
                        break;
                    }
                }
                if (nonRepeatingDate)
                    System.out.println("NO");
                else
                    System.out.println("SI");
                dateSet.clear();
                sc.nextLine();
            }
            
            first = false;
            caseNumber = sc.nextInt();
        } while (caseNumber != 0);

        sc.close();
    }
}
