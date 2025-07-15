package ex_15_Array;

public class Lab_137_Sum_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = {12, 34, 10};
		int sum = 0;
		
		for(int i =0; i<number.length; i++)
		{
			sum = sum+number[i];
		}
		
		System.out.println(sum);
		
	}

}
