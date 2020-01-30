//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   for(int i=0; i<20; i++) {
		   out.print("*");
	   }
	   out.print("\n");
   }

   public void printTwentyDashes()
   {
	   for(int i=0; i<20; i++) {
		   out.print("-");
	   } 
	   out.print("\n");
   }

   public void printTwoBlankLines()
   {
	   out.println("\n\n");
   }
   
   public void printASmallBox()
   {	
	   out.println("***");
	   out.println("* *");
	   out.println("***");
   }
 
   public void printABigBox()
   { 	
	   out.println("*****");
	   out.println("*   *");
	   out.println("*   *");
	   out.println("*   *");
	   out.println("*****");
   }   
}