//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups=new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		Dog a = new Dog(age, name);
		if (!(spot>pups.length||spot<0)) {
			pups[spot]=a;
		}
	}

	public String getNameOfOldest()
	{
		int maxAge=pups[0].getAge();
		int maxIt=0;
		for(int i=1; i<pups.length; i++) {
			if(pups[i].getAge()>maxAge) {
				maxIt=i;
			}
		}
		return pups[maxIt].getName();
	}

	public String getNameOfYoungest()
	{
		int minAge=pups[0].getAge();
		int minIt=0;
		for(int i=1; i<pups.length; i++) {
			if(pups[i].getAge()<minAge) {
				minIt=i;
			}
		}
		return pups[minIt].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}