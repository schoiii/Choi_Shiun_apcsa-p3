//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private int girth;
	private String name;
	//add a constructor
	public Skeleton() {
		girth=0;
		name="";
	}
	public Skeleton(int g, String n) {
		girth=g;
		name=n;
	}
	//add code to implement the Monster interface
	public int getHowBig() {
		return girth;
	}
	public String getName() {
		return name;
	}
	public boolean isBigger(Monster other) {
		return(girth>other.getHowBig());
	}
	public boolean isSmaller(Monster other) {
		return(girth<other.getHowBig());
	}
	public boolean namesTheSame(Monster other) {
		return (name.contentEquals(other.getName()));
	}
	//add a toString
	public String toString() {
		return(name+" has a girth of "+girth+" inches");
		
	}
}