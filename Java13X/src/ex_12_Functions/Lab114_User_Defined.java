package ex_12_Functions;

public class Lab114_User_Defined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int result = sum_of_number(2, 5);
		
		sum_of_number_no_return(4, 7);
		
		System.out.println(result);
	}
	
	static int sum_of_number(int a, int b)
	{
		return a+b;
	}
	
	static void sum_of_number_no_return(int a, int b)
	{ 
		System.out.println(a+b);
	}

}
