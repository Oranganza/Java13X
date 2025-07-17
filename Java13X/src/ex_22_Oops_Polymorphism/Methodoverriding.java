package ex_22_Oops_Polymorphism;

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal();
		a.sound();
		
	}

}

class Animal
{
	void sound()
	{
		System.out.println("Barking");
	}
	
	class Dog extends Animal
	{
		@Override
		 void sound()
		 {
			 System.out.println(" ");
		 }
	}
}
