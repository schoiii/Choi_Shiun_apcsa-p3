//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence="";
		lookFor='a';
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		while(cleaned.indexOf(lookFor)!=-1) {
			String cleaning=cleaned.substring(0,cleaned.indexOf(lookFor))+cleaned.substring(cleaned.indexOf(lookFor)+1);
			cleaned=cleaning;
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}