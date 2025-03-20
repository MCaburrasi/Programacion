package _java.unidad6.clases.tests;

import _java.unidad6.clases.classes.Account2;

import java.util.Scanner;

public class TransferTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account2 acc1 = new Account2 (1, "Name 1",500);
		Account2 acc2 = new Account2 (2, "Name 2",500);
		int op = 1;
		while (op != 3) {
			System.out.println("1 - Transferir cuenta 1 a cuenta 2");
			System.out.println("2 - Transferir cuenta 2 a cuenta 1");
			System.out.println("3 Salir");
			op = sc.nextInt();
			sc.nextLine();
			if (op == 1){
				acc1.transfer(acc2, 200);
			} else if (op == 2) {
				acc2.transfer(acc1, 200);
			}
			System.out.println(acc1);
			System.out.println(acc2);
			System.out.println(" ");

			Account2.transfer(acc1, acc2, 30);
			System.out.println(acc1);
			System.out.println(acc2);
		}
	}
}
