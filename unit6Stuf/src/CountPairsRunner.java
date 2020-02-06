//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		System.out.println( CountPairs.pairCounter("test_cases") );
		CountPairs c = new CountPairs();
		System.out.println(c.pairCounter("ddogccatppig"));
		System.out.println(c.pairCounter("dogcatpig"));
		System.out.println(c.pairCounter("xxyyzz"));
		System.out.println(c.pairCounter("a"));
		System.out.println(c.pairCounter("abc"));
		System.out.println(c.pairCounter("aabb"));
		System.out.println(c.pairCounter("dogcatpigaabbcc"));
		System.out.println(c.pairCounter("aabbccdogcatpig"));
		System.out.println(c.pairCounter("dogabbcccatpig"));
		System.out.println(c.pairCounter("aaaa"));
		System.out.println(c.pairCounter("AAAAAAAAA"));
		//add in all of the provided test cases from the lab handout	
	}
}