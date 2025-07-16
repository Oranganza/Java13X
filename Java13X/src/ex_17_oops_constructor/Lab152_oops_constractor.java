package ex_17_oops_constructor;

public class Lab152_oops_constractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		baby b1 = new baby();
	}

}

class baby
{
	String name; 
	
	//Default constrctor
	
	baby()
	{
		System.out.println("I am a default constructor");
	}

//Behaviour
void cry()
{
	System.out.println("crying");
}

void sleep()
{
	System.out.println("sleeping");
}

void eat()
{
	System.out.println("Eating");
}
}