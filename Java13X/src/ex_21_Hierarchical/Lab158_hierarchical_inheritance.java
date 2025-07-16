package ex_21_Hierarchical;

public class Lab158_hierarchical_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Father f1 = new Father();
		Ruhani r = new Ruhani();
		f1.home();
		r.home();
		
		Pramod p = new Pramod();
		Sachine s = new Sachine();
		
		p.home();
		s.home();
		
		p.p();
		
	}

}

class Father
{
	void home()
	{
		System.out.println("3BHK");
	}
}

class Pramod extends Father
{
	void p()
	{
		System.out.println("home-Pramod");
	}
}

class Ruhani extends Father
{
	void R()
	{
		System.out.println("Ruhani - Car");
	}
}

class Sachine extends Father
{
	void s()
	{
		System.out.println("Sachine - home");
	}
}
