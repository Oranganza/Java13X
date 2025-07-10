package ex_10_While;

import java.util.Scanner;

public class Lab0105_while_IQ_Factorial_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the factorial program \n Enter the numbar");
		if(!sc.hasNextInt())
		{
			System.out.println("Invalid input. Please enter an integer");
			sc.close();
			return;
			
		}
		int number = sc.nextInt();
		sc.close();
		if(number < 0) {
			System.out.println("Negative factorial is not allowed");
			return;
		}
		int factorial = 1;
		
		if(number<=0)
		{
			System.out.println(factorial);
		}
		else
		{
			for(int i =1; i<= number; i++)
			{
				factorial = factorial*i;
			}
		}
		System.out.println("Factorial is--"+factorial);
			
	}

}
