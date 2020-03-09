//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList=new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		ArrayList NameList=new ArrayList<String>();
		String name="";
		for(int i=0; i<toys.length(); i++) {
			if(toys.substring(i, i+1).equals(" ")) {
				boolean check=true;
				for(int j=0; j<NameList.size(); j++) {
					if(name.equals(NameList.get(j))) {
						check=false;
					}
				}
				if(check) {
					NameList.add(name);
				}
			} else {
				name+=toys.substring(i, i+1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}