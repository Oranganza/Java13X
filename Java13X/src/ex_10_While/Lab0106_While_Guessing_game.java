package ex_10_While;


import java.util.Random;
import java.util.Scanner;

public class Lab0106_While_Guessing_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int numberToGuess = random.nextInt(100)+1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int guess;
		int attempts = 0;
		
		while(true)
		{
			guess = sc.nextInt();
			attempts++;
			
			if(guess < numberToGuess)
			{
				System.out.println("To Low, try again");
			}
			else if(guess> numberToGuess)
			{
				System.out.println("To High, try again");
			}
			else
			{
				System.out.println("Correct ! You guessed it in" + attempts);
				break;
			}
				
		}
	}

}
