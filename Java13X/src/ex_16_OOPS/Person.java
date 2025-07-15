package ex_16_OOPS;

public class Person {

	String name;
	int age;
	String height;
	String gender;
	boolean is_married;
	
	void walk()
	{
		System.out.println("Walking");
	}
	
	void eat(String food)
	{
		System.out.println("Eating");
	}
	
	String sleep()
	{
		System.out.println("sleeping");
		return null;
	}
	
	String food(int a)
	{
		System.out.println("Eating");
		return null; 
	}
}
