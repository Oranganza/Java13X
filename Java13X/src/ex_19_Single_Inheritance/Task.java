package ex_19_Single_Inheritance;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal a = new Animal();
		a.makesound();
		
		System.out.println("-----------------");
		
		cat c = new cat();
		c.meow();
		c.makesound();
		
	}

}

class Animal
{
	void makesound()
	{
		System.out.println("barking");
	}
}

class cat extends Animal
{
	void meow()
	{
		System.out.println("meowww");
	}
}