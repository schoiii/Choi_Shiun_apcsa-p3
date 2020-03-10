//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;
	public Rational() {
		setRational(1,1);
	}
	public Rational(int i, int j) {
		setRational(i,j);
		// TODO Auto-generated constructor stub
	}
	//write two constructors
	

	//write a setRational method
	public void setRational(int num, int dem) {
		numerator=num;
		denominator=dem;
	}
	public int getNum() {
		return numerator;
	}
	public int getDem() {
		return denominator;
	}
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		numerator=numerator*other.getDem()+other.getNum()*denominator;
		denominator=denominator*other.getDem();
		


		reduce();
	}

	private void reduce()
	{
		int max;
		if(numerator>denominator) {
			max=numerator;
		} else {
			max=denominator;
		}
		for(int i=max;i>0; i--) {
			if(numerator%i==0&&denominator%i==0) {
				numerator=numerator/i;
				denominator=denominator/i;
			}
		}


	}

	private int gcd(int numOne, int numTwo)
	{
		int max;
		if(numOne>numTwo) {
			max=numOne;
		} else {
			max=numTwo;
		}
		for(int i=max; i>0; i++) {
			if(numOne%i==0&&numTwo%i==0) {
				return i;
			}
		}

		return 1;
	}

	public Object clone ()
	{
		Rational a=new Rational();
		a.setRational(numerator,  denominator);
		return a;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals(Rational r)
	{
		reduce();
		r.reduce();
		if(numerator==r.getNum()&&denominator==r.getDem()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		double o=(double)((double)numerator/(double)denominator);
		double n=(double)((double)other.getNum()/(double)other.getDem());
		if(o>n) {
			return 1;
		} else {
			return -1;
		}
	}



	
	//write  toString() method
	
	public String toString() {
		return(numerator+"/"+denominator);
	}
}