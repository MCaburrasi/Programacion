package _java.unidad9.teoria.enums;

public enum RockPaperScissors {
	ROCK("r"), PAPER("p"), SCISSORS("s");

	RockPaperScissors(String simplGest) {}

	public static RockPaperScissors gestureOf(String election) {
		RockPaperScissors result;
		if (election.equals("r") || election.equals("0")) result = RockPaperScissors.ROCK;
		else if (election.equals("p") || election.equals("1")) result = RockPaperScissors.PAPER;
		else result = RockPaperScissors.SCISSORS;

		return result;
	}

	public static String game (RockPaperScissors p1gest, RockPaperScissors p2gest){

		String result = "Draw, no one wins!";

		int comparaison = p1gest.compare(p2gest);
		if (comparaison < 0) result = "Player 2 wins!";
		else if (comparaison > 0) result = "You win!";

		return result;
	}

	public static RockPaperScissors gestureOf(String election, boolean machine) {
		return RockPaperScissors.gestureOf(election);
	}

	public int compare(RockPaperScissors g2){
		int result = 0;
		if ((this == ROCK && g2 == SCISSORS) ||
			(this == PAPER && g2 == ROCK) ||
			(this == SCISSORS && g2 == PAPER))
			result = 1;
		else if ((this == SCISSORS && g2 == ROCK) ||
				(this == ROCK && g2 == PAPER) ||
				(this == PAPER && g2 == SCISSORS))
			result = -1;
		return result;
	}
}
