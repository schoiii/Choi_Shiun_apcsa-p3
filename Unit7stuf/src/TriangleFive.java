//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter=' ';
		amount=0;
	}

	public TriangleFive(char c, int amt)
	{
		letter=c;
		amount=amt;
	}

	public void setLetter(char c)
	{
		letter=c;
	}

	public void setAmount(int amt)
	{
		amount=amt;
	}

	public String toString()
	{
		String output="";
		
		for(int i=0; i<amount; i++) {
			char printLetter=letter;
			for(int j=amount; j>i; j--) {
				
				for(int k=j; k>0; k--) {
					output=output+printLetter;
				}
				if(printLetter=='Z') {
					printLetter='A';
				} else {
					printLetter=(char)(printLetter+1);
				}
				output=output+" ";
			}
		output=output+"\n";
		}
		return output;
	}
}