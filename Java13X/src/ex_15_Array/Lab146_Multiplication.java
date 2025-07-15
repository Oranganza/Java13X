package ex_15_Array;

import java.util.Scanner;

public class Lab146_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Interview Question - Multiplication of Table
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int Size_of_Table = sc.nextInt();
		
		for(int i = 0; i < Size_of_Table; i++)
		{
			for(int j = 0; j < Size_of_Table; j++)
			{
				System.out.print(i*j + " | ");
			}
			System.out.println();
		}
	}

}
