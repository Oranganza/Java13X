package ex_15_Array;

public class Lab148_Array_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//    *
		//  * * *
		//*  * * * *
		
		int n = 3;
		
		for(int i = 0; i <  n; i++)
		{
			for(int j = 0; j < n - i - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
