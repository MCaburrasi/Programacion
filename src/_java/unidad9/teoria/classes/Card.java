package _java.unidad9.teoria.classes;

import _java.unidad9.teoria.enums.Rank;
import _java.unidad9.teoria.enums.Suit;

public class Card {
	private Rank rank;
	private Suit suit;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	Rank getRank() { return rank; }
	Suit getSuit() { return suit; }

	@Override
	public String toString() {
		return "Card[" + "rank=" + rank + ", suit=" + suit + ']';
	}
}
