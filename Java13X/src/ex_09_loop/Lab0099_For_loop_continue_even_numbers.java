package ex_09_loop;

public class Lab0099_For_loop_continue_even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		for(int i=1; i<50; i++)
		{
			if(i% 2 ==0)
			{
				continue;
			}
			else
			{
				System.out.println("odd--"+i);
			}
	}
	}

}
