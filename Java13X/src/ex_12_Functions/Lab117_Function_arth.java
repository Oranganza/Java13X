package ex_12_Functions;

import java.util.Scanner;

public class Lab117_Function_arth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a function of sub, sum, mul, div
		// with parameter a and b(take the parameter from the user
		
		// Logic Building
		//Step 1 - input and output
		// a,b -> int - scanner
		// int -> variable result
		
		// step 2 - rough logic - create function
		// function - type 4th - with return and with arguments/parameter
		
		// step 3 - write the code find and fix - Edge cases
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num 1");
		int a = 0;
		if(sc.hasNextInt())
		{
			a = sc.nextInt();
		}
		else
		{
			System.out.println("Enter the number only");
			return;
		}
		
		System.out.println("Enter the num 2");
		int b = 0;
		if(sc.hasNextInt())
		{
			b = sc.nextInt();
		}
		
		else
		{
			System.out.println("Enter the number only");
			return;
		}
		
		int result_sum = sum(a, b);
		System.out.println(result_sum);
		
		int result_sub = sub(a,b);
		System.out.println(result_sub);
		
		int result_mul = mul(a,b);
		System.out.println(result_mul);
		
		int result_div = div(a,b);
		System.out.println(result_div);
	}
	
	static int sum(int a,int b)
	{
		return a+b;
	}

	static int sub(int a, int b)
	{
		return a-b;
	}
	
	/**
	* Multiplies two integer
	* @param a is the first integer
	* @param b the second integer
	* @return the product of a and b
	
	*/
	
	static int mul(int a, int b)
	{
		return a*b;
	}
	
	/**
	* Divide two integer
	* @param a is the first integer
	* @param b the second integer
	* @return the quotient of a and b
	
	*/
	
	static int div(int a, int b)
	{
		
		if(b==0) {
			System.out.println("b can't be zero");
			System.exit(0);
		}
		return a/b;
		}
	}

