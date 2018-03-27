package BT1_SimpleSort;

public class Deck {
	public Card [] cards;
public Deck() {
	// TODO Auto-generated constructor stub
	cards = new Card[52];
	int temp = 0;
	for (int i = 1; i <= 13 ; i++) {
		for (int j = 0; j < 4; j++) {
			cards[temp] = new Card(i, j);
			temp++; 
		}
	}

}
}
