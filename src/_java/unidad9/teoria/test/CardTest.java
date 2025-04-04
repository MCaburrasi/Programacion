package _java.unidad9.teoria.test;

import _java.unidad9.teoria.classes.Card;
import _java.unidad9.teoria.classes.CardDeck;

public class CardTest {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.print();
		deck.shuffle();
		deck.print();
	}
}
