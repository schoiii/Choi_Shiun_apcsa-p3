//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word :: ");
		String s = keyboard.next();
		StringOddOrEven j=new StringOddOrEven(s);
		j.isEven();
		System.out.println(j.toString());
		
	}
}