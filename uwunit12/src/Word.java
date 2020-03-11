//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word=s;
	}
	public String get() {
		return word;
	}
	
	public int compareTo( Word rhs )
	{		
		
		if(word.length()>rhs.get().length()) {
			return 1;
		}
		if(word.length()<rhs.get().length())
			return -1;
		for(int i=0; i<Math.min(word.length(),rhs.get().length()); i++) {
		if(word.charAt(i)>rhs.get().charAt(i)) {
			return 1;
		}
		if(word.charAt(i)<rhs.get().charAt(i))
			return -1;
		}
		return 0;
	}

	
	public String toString()
	{
		return ""+word;
	}
}