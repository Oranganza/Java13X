package ex_13_String;

import java.util.Scanner;

public class Lab125_Interview_coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Palindrome
		// madam -> reverse -> madam
		// s1 = madam
		// s1_reverse = madam
		// s1 == s1_reverse
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String input = sc.next();
		String newString_reversed = reversestringSB(input);
		
		if(newString_reversed.equalsIgnoreCase(input))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
	static String reversestringSB(String userInput)
	{
		String reversed = "";
		for(int i = userInput.length()-1; i>=0; i--)
		{
			reversed = reversed + userInput.charAt(i);
		}
			return reversed;
		}
		
		
	}


