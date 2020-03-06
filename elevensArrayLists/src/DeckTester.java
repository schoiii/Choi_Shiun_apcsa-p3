/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] rank = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] stuf= {11, 12, 13};
		
		
		Deck deck1 = new Deck(rank, suits, stuf);
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		deck1.shuffle();
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
	}
}
