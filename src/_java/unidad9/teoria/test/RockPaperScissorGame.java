package _java.unidad9.teoria.test;

import _java.unidad9.teoria.enums.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Rock, Paper or Scissors (r / p / s): ");
			RockPaperScissors p1gest = RockPaperScissors.gestureOf(sc.next());
			RockPaperScissors p2gest = RockPaperScissors.gestureOf(Integer.toString(rnd.nextInt(3)));

			System.out.println("P1 chose: " + p1gest);
			System.out.println("P2 chose: " + p2gest);

			String gameFinish = RockPaperScissors.game(p1gest, p2gest);

			System.out.println(gameFinish);
			System.out.print("Play again? (Y/N): ");

		} while (!sc.next().equalsIgnoreCase("N"));
	}
}

