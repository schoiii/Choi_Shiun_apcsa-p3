//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect p = new Perfect();
		System.out.println(p.isPerfect());
		p.set(45);
		System.out.println(p.isPerfect());
		p.set(6);
		System.out.println(p.isPerfect());
		p.set(14); System.out.println(p.isPerfect());
		p.set(8128); System.out.println(p.isPerfect());
		p.set(1245); System.out.println(p.isPerfect());
		p.set(33); System.out.println(p.isPerfect());
		p.set(28); System.out.println(p.isPerfect());
		p.set(27); System.out.println(p.isPerfect());
		p.set(33550336); System.out.println(p.isPerfect());
		
	}
}