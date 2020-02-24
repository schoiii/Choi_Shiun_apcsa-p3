//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd=-1;
		int even=-1;
		for(int i=0; i<ray.length; i++) {
			if(odd==-1) {
				if(ray[i]%2==1) {
					odd=i;
				}
			}
		}
		if(odd!=-1) {
		for(int i=odd; i<ray.length; i++) {
			if(even==-1) {
				if(ray[i]%2==0) {
					even=i;
				}
			}
		}
		if(odd==-1||even==-1) {
			return odd;
		}
		return even-odd;
	} else {return -1;}
} }