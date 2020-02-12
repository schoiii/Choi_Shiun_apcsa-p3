//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("pick your weapon[R,P,S] :: ");
			String input=keyboard.next();
			System.out.print(input);
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors(input);
			System.out.println(game);
			out.print("pick your weapon[R,P,S] :: ");
			input=keyboard.next();
			System.out.print(input);
			game.setPlayers(input);
			System.out.println(game);
			out.print("pick your weapon[R,P,S] :: ");
			input=keyboard.next();
			System.out.print(input);
			game.setPlayers(input);
			System.out.println(game);
			out.print("pick your weapon[R,P,S] :: ");
			input=keyboard.next();
			System.out.print(input);
			game.setPlayers(input);
			System.out.println(game);
			out.print("pick your weapon[R,P,S] :: ");
			input=keyboard.next();
			System.out.print(input);
			game.setPlayers(input);
			System.out.println(game);
			
	}
}



