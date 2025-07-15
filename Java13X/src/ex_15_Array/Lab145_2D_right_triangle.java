package ex_15_Array;

import java.util.Scanner;

public class Lab145_2D_right_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// n = 3
		// *
		// **
		///***
		
		System.out.println("Enter the number n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//int n = 3;
		
		for (int i =0; i< n; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
