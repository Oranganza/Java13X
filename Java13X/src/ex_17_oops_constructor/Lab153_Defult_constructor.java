package ex_17_oops_constructor;

public class Lab153_Defult_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car c1 = new car();
		child b1 = new child();
		
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.year);
		
		
		System.out.println(b1.name);
	}

}

class car
{
	String name;
	String model;
	int year;
	
	car()
	{
		name = "Unknown car";
		model = "A1234";
		year = 2025;
	}
}

class child
{
	String name;
	
	child()
	{
		name = "Gugu";
	}
	
}