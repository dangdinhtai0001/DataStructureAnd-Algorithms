package BT1_SimpleSort;

public class Card implements Comparable<Card>{
	private int rank, suite;

	public Card(int rank , int suite) {
		// TODO Auto-generated constructor stub
		this.rank = rank;
		this.suite = suite;
	}
	
	private String strRank(int rank) {
		if(rank == 1) {
			return "Aces";
		}if(rank == 11) {
			return "Jack";
		}if(rank == 12) {
			return "Queen";
		}if(rank == 13) {
			return "King";
		}if(rank >1 && rank <11) {
			return String.valueOf(rank);
		}
		return null;
	}
	
	private String strSuite(int suite) {
		if(suite == 0) {
			return "SPADES";
		}if(suite == 1) {
			return "CLUBS";
		}if(suite == 2) {
			return "DINAMONDS";
		}if(suite == 3) {
			return "HEARTS";
		}
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" +strSuite(this.suite) + ":"+ strRank(this.rank) + "]";
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		if(this.rank == o.rank) {
			return this.suite-o.suite;
		}if(this.rank != o.rank ) {
			return this.rank - o.rank;
		}
		return 0;
 	}
}
