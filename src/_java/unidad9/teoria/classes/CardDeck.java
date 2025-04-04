package _java.unidad9.teoria.classes;

import _java.unidad9.teoria.enums.Rank;
import _java.unidad9.teoria.enums.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
	List<Card> deck;
	public CardDeck() {
		deck = new ArrayList<Card>();
		for (Suit suit : Suit.values()){
			for (Rank rank : Rank.values()){
				deck.add(new Card(rank, suit));
			}
		}
	}

	public void print() {
		deck.forEach(System.out::println);
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}
}
