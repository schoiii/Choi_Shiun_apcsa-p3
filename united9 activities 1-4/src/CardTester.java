/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card stuff= new Card("ten", "hearts", 12);
		System.out.println(stuff);
		Card stuf=new Card("nine","clubs",17);
		System.out.println(stuff.matches(stuf));
	}
}
