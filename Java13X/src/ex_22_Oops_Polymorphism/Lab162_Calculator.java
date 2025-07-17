package ex_22_Oops_Polymorphism;

public class Lab162_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Calc c1 = new Calc();
		c1.add(3, 4);
		c1.add(2.55, 1.25);
	}

}

class Calc
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	double add(double a, double b)
	{
		return a+b;
	}
}
