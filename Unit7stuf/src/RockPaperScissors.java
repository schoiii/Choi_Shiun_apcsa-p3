//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice="R";
		compChoice="R";
	}

	public RockPaperScissors(String player)
	{
		playChoice=player;
		int cc=(int)(Math.random()*3.0);
		if(cc==0) {
			compChoice="R";
		} else if (cc==1) {
			compChoice="P";
		} else {
			compChoice="S";
		}
	}

	public void setPlayers(String player)
	{
		playChoice=player;
		int cc=(int)(Math.random()*3.0);
		if(cc==0) {
			compChoice="R";
		} else if (cc==1) {
			compChoice="P";
		} else {
			compChoice="S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice.equals(compChoice)) {
			winner="draw";
		} else if ((playChoice.equals("rock")&&compChoice.equals("paper"))||(playChoice.equals("paper")&&compChoice.equals("rock"))||(playChoice.equals("scissors")&&compChoice.equals("paper"))) {
			winner="player";
		} else {
			winner="comp";
		}
		return winner;
	}

	public String toString()
	{
		String output;
		if(determineWinner().equals("draw")) {
			output="player had "+playChoice+"\ncomputer had "+compChoice+"Draw Game";
		} else {
			output="player had "+playChoice+"\ncomputer had "+compChoice+"\n"+determineWinner()+" wins";
		}
		return output;
	}
}