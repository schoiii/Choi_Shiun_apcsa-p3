//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public void Perfect() {
	   number=0;
   }
   public void Perfect(int n) {
	   number=n;
   }
   public void set(int n) {
	   number=n;
   }
	//add a set method

	public boolean isPerfect()
	{
		int check=0;
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				check=check+i;
			}
		}
		if(check==number) {
			return true;
		} else {
			return false;
		}
	}

	//add a toString	
	
}