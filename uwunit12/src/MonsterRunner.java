//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("enter girth for monster one");
		int size=keyboard.nextInt();
		System.out.println("enter name for monster one");
		String name=keyboard.next();
		Monster test=new Skeleton(size,name);
		System.out.println("enter girth for monster two");
		size=keyboard.nextInt();
		System.out.println("enter name for monster two");
		name=keyboard.next();
		Monster test2=new Skeleton(size,name);
		System.out.println("Monster 1 - "+test.getName()+" "+test.getHowBig());
		System.out.println("Monster 2 - "+test2.getName()+" "+test2.getHowBig());
		if(test.isBigger(test2)) {
			System.out.println("Monster 1 is bigger than 2");
			
		} else {
			System.out.println("Monster 2 is bigger than Monster 1");
		}
		if(test.namesTheSame(test2)) {
			System.out.println("Monster 1 has the same name as 2");
		} else {
			System.out.println("Monster 1 doesn't have the same name as 2");
		}
		
} }