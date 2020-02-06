//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases		
		Word w=new Word("Hello");
		System.out.println(w.getFirstChar());
		System.out.println(w.getLastChar());
		System.out.println(w.getBackWards());
		System.out.println(w.toString());
		w.setString("World");
		System.out.println(w.getFirstChar());
		System.out.println(w.getLastChar());
		System.out.println(w.getBackWards());
		System.out.println(w.toString());
		w.setString("JukeBox");
		System.out.println(w.getFirstChar());
		System.out.println(w.getLastChar());
		System.out.println(w.getBackWards());
		System.out.println(w.toString());
		w.setString("TCEA");
		System.out.println(w.getFirstChar());
		System.out.println(w.getLastChar());
		System.out.println(w.getBackWards());
		System.out.println(w.toString());
		w.setString("UIL");
		System.out.println(w.getFirstChar());
		System.out.println(w.getLastChar());
		System.out.println(w.getBackWards());
		System.out.println(w.toString());
	}
}