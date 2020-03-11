//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\chois2238\\Documents\\GitHub\\Choi_Shiun_apcsa-p3\\uwunit12\\src\\words.dat"));
		int size = file.nextInt();
		Word[] words=new Word[size];
		for(int i=0; i<size; i++)
			words[i]=new Word(file.nextLine());
		
		Arrays.sort(words);
		
		for(Word w : words) {
			System.out.println(w);
		}
	}
}