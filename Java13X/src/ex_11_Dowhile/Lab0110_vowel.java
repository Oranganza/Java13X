package ex_11_Dowhile;

import java.util.Scanner;

public class Lab0110_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().toLowerCase().charAt(0);
		
		if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
		{
			System.out.println(ch + " is a vowel");
		
		}
		else if(ch>='a' && ch>='z')
		{
			System.out.println(ch + " is not a vowel");
		}
		else
		{
			System.out.println("Invalid Char!");
		}
		
		sc.close();
	}

}
