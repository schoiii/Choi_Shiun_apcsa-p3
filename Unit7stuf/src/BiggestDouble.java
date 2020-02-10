//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;
import static java.lang.Math.*;
public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one=a;
		two=b;
		three=c;
		four=d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one=a;
		two=b;
		three=c;
		four=d;
	}

	public double getBiggest()
	{
		return Math.max(one, Math.max(two, Math.max(three, four)));
	}

	public String toString()
	{
	   return one+" "+two+" "+three+" "+four;
	}
}