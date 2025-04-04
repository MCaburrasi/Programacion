package _java.unidad9.teoria.test;

import _java.unidad9.teoria.enums.PhoneModel;

import java.util.Scanner;

public class PhoneModelTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Your budget: ");
		int budget = sc.nextInt();

		for (PhoneModel pM : PhoneModel.values()){
			if (pM.getPrice() <= budget)
				System.out.println(pM + "\t price: " + pM.getPrice());
			else{
				System.out.println("You do not have suficient money");
				break;
			}
		}
	}
}
