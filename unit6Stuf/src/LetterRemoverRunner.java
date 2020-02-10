//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases	
		LetterRemover a=new LetterRemover("I am Sam I am", 'a');
		System.out.println(a.toString());
		System.out.println(a.removeLetters());
		a.setRemover("sssssssxssssssesssssssesssss", 's');
		System.out.println(a.toString());
		System.out.println(a.removeLetters());
		a.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(a.toString());
		System.out.println(a.removeLetters());
		a.setRemover("abababababababababa", 'b');
		System.out.println(a.toString());
		System.out.println(a.removeLetters());
		a.setRemover("abababababababababa", 'x');
		System.out.println(a.toString());
		System.out.println(a.removeLetters());
	}
}