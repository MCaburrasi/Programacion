package _java.unidad6.clases.tests;
import _java.unidad6.clases.classes.Account2;

import java.util.Scanner;

public class Account2Test {
    public static void main(String[] args) {
        Account2 account;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            account = new Account2(i, "Name" + i, 100);
            System.out.println("\nCreated account " + account);
            System.out.println("Now there are " + Account2.getNumAccounts() + " accounts");
        }
    }
}