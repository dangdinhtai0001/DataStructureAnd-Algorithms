package BT1_SimpleSort;

import java.util.Random;

import MyTools.Tool;
import SimpleSort.SimpleSort;

public class test {
	public static void main(String[] args) {
		Deck deck = new Deck();
		showDeck((Card[]) SimpleSort.bubbleSortASC(deck.cards));
		
		System.out.println("**********************************************");
		showDeck(shuffle((Card[]) SimpleSort.bubbleSortASC(deck.cards)));
	}

	public static void showDeck(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			System.out.println(cards[i].toString());
		}
	}
 
	public static Card[] shuffle(Card[] cards) {
		Random random = new Random();
		for (int i = 0; i < cards.length; i++) {
			Tool.swap(cards, i, random.nextInt(cards.length));
		}
		return cards;
	}
}
