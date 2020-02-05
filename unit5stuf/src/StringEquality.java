//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	private boolean j;

	public StringEquality()
	{
		wordOne="";
		wordTwo="";
	}

	public StringEquality(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public void setWords(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public boolean checkEquality( )
	{
		if(wordOne.equals(wordTwo)) {
			j=true;
			return true;
		}
		j=false;
		return false;
	}

	public String toString()
	{
		if(!j) {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		} else {
		return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		}
}