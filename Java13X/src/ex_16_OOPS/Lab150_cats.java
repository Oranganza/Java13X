package ex_16_OOPS;

public class Lab150_cats {

	public static void main(String[] args)
	{
		cat c1 = new cat();
		new cat();
		cat c2;
		
		c1.running();
		
		new cat().running();
	}
}

class cat
{
	String name;
	
	void running()
	{
		System.out.println("Running");
	}
}
