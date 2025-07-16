package ex_17_oops_constructor;

public class Lab154_PC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BabyA b1 = new BabyA();
		BabyA b2 = new BabyA();
		System.out.println(b1.name);
		System.out.println(b2.name);
		
		BabyA b3 = new BabyA("Lucky", "172782652", 8, 2001, 4);
		BabyA b4 = new BabyA("Sunny", "172799652", 10, 2000, 7);
		System.out.println(b3.name);
		System.out.println(b4.name);
	}

}

class BabyA
{
	String name ;
	String adhar_number;
	int age;
	int year;
	int month;
	
	BabyA()
	{
		name = "Vedant";
		adhar_number = "0100200";
		age = 4;
		year = 2000;
		month = 3;
	}
	// Parameterize constructor
	BabyA(String name_user, String adhar_number_user, int age_user, int year_user, int month_user)
	{
		this.name = name_user;
		this.adhar_number = adhar_number_user;
		this.age = age_user;
		this.year = year_user;
		this.month = month_user;
	}
}

