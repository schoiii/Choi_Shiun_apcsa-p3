//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		boolean a=true;
		int odd=-1;
		int even=-1;
		for(int i=0; i<ray.size(); i++) {
			if(a&&ray.get(i)%2==1) {
				odd=i;
				a=false;
			}
		}
		boolean b=true;
		for(int i=ray.size()-1; i>odd-1; i--) {
			if(b&&ray.get(i)%2==0) {
				even=i;
				b=false;
			}
		}
		if(even==-1||odd==-1) {
			return -1;
		}
		return even-odd;
	}
}