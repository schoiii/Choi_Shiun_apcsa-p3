import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
		System.out.println(ListOddToEven.go(list));
		list=Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7);
		System.out.println(ListOddToEven.go(list));
		list=Arrays.asList(10,20,30,40,5,41,31,20,11,7);
		System.out.println(ListOddToEven.go(list));
		list=Arrays.asList(23767,70,4,5,6,7);
		System.out.println(ListOddToEven.go(list));
		list=Arrays.asList(2,4,6,8,8);
		System.out.println(ListOddToEven.go(list));
	}
}