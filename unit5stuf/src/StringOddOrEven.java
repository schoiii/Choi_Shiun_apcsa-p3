//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private String e;
	public StringOddOrEven()
	{
		word="";
	}

	public StringOddOrEven(String s)
	{
		word=s;
	}

	public void setString(String s)
	{
		word=s;
	}

 	public boolean isEven()
 	{
		if(word.length()%2==0) {
			e="even";
			return true;
		}
		e="odd";
 		return false;
	}

 	public String toString()
 	{
 		String output=word+" is "+e;
 		return output;
	}
}