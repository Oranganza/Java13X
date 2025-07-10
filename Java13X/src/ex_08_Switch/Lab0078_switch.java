package ex_08_Switch;

import java.util.Scanner;

public class Lab0078_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Take a user input and tell them the day which they have told
		// 1 to 7 -> 1 -> Mon,  5 ->Fri  
		// 8 -> ? - Not allowed or error
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day from 1 to 7");
		int day = sc.nextInt();
		
		switch(day) {
		
		case 1: 
			System.out.println("Mon");
			break;
			
		case 2: 
			System.out.println("Tue");
			break;
		case 3: 
			System.out.println("Wed");
			break;
		case 4: 
			System.out.println("Thus");
			break;
		case 5: 
			System.out.println("Fri");
			break;
		case 6: 
			System.out.println("Sat");
			break;
		case 7: 
			System.out.println("Sun");
			break;
			
			default:
				System.out.println("Not Allowed");
				break;
		}
	}

}
