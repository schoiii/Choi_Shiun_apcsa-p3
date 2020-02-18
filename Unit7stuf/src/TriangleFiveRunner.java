//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive n = new TriangleFive('C', 4);
	   System.out.println(n);
	   n.setLetter('A');
	   n.setAmount(5);
	   System.out.println(n);
	   n.setLetter('B');
	   n.setAmount(7);
	   System.out.println(n);
	   n.setLetter('X');
	   n.setAmount(6);
	   System.out.println(n);
	   n.setLetter('Z');
	   n.setAmount(8);
	   System.out.println(n);
	}
}