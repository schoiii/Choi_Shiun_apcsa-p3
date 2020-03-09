//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test=new ToyStore();
		test.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(test.getThatToy("sorry")+" "+test.getThatToy("bat")+" "+test.getThatToy("train")+" "+test.getThatToy("teddy")+" "+test.getThatToy("ball"));
		System.out.println("The most frequent toy is "+test.getMostFrequentToy());
		System.out.println(test.getThatToy("ball"));
		test.sortToysByCount();
	}
}