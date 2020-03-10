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
		toys+=" ";
		List<String> NameList=new ArrayList<String>();
		int startIndex=0;
		for(int i=0; i<toys.length(); i++) {
			if(toys.substring(i, i+1).contentEquals(" ")) {
				NameList.add(toys.substring(startIndex,i));
				startIndex=i+1;
				
				
			}
		}
		ArrayList<Toy> toysList=new ArrayList<Toy>();
		for(int i=0; i<NameList.size(); i++) {
			boolean check=false;
			for(int j=0; j<i; j++) {
				if(NameList.get(i).equals(NameList.get(j))) {
					check = true;
				}
			}
			int num=0;
			if(!check) {
				for(String s : NameList) {
					if(s.equals(NameList.get(i))) {
						num++;
					}
				}
				Toy stuff=new Toy(NameList.get(i));
				stuff.setCount(num);
				toysList.add(stuff);
			}
		}
		toyList=toysList;
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy t : toyList) {
  			if(t.getName().contentEquals(nm)) {
  				return t;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy max=new Toy();
  		for(Toy t:toyList) {
  			if(t.getCount()>max.getCount()) {
  				max=t;
  			}
  		}
  		return max.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		for(int j=0; j<toyList.size(); j++)
  		for(int i=0; i<toyList.size()-1; i++)
  			if(toyList.get(i).getCount()<toyList.get(i+1).getCount()) {	
  				Toy a = new Toy(toyList.get(i).getName());
  				a.setCount(toyList.get(i).getCount());
  				Toy b= new Toy(toyList.get(i+1).getName());
  				b.setCount(toyList.get(i+1).getCount());
  				
  				toyList.set(i, b);
  				toyList.set(i+1,  a);
  				
  		}
  		System.out.println(toyList);
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}