/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the slow dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		int pos = sample.indexOf("slow");
		for(int i =0; i<sample.length()-3;i++) {if(sample.substring(i,i+3).toLowerCase().equals("the")) {System.out.println("the is found at position "+i);}}
		if(pos >= 0) {
		System.out.println("slow is found at position " + pos);
		}
		else {
		System.out.println("slow is not found");
	} }
	

}
