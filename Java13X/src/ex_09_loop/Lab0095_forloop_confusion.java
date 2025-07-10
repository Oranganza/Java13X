package ex_09_loop;

public class Lab0095_forloop_confusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if you use i = 0 then do not write <= then loop will execute 11 times if you have that requirement then only you can use it
		for(int i =0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		for(int i =1; i <= 10; i++)
		{
			System.out.println(i);
		}
		
	}

}
