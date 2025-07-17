package ex_22_Oops_Polymorphism;

public class Lab160_Moverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Home h1 = new Home();
		h1.Task(5);
		h1.Task(false);
	}

}

class Home
{
	void Task()
	{
		System.out.println("Task 1");
	}
	
	int Task(int a)
	{
		System.out.println("Task 2");
		return a;
	}
	
	boolean Task(boolean a)
	{
		return false;
	}
}
