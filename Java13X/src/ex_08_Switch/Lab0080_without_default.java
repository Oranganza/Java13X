package ex_08_Switch;

import java.util.Scanner;

public class Lab0080_without_default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	}

}
}

