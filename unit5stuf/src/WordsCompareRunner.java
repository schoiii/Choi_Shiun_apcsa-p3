//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word :: ");
		String s = keyboard.next();
		System.out.println("Enter a word :: ");
		String w = keyboard.next();
	   WordsCompare p=new WordsCompare(s,w);
	   p.compare();
	   System.out.println(p.toString());
	}
}