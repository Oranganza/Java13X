package ex_UserInput;

import java.util.Scanner;

public class lab_Userinput_scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age");
		
		int age = scanner.nextInt();
	    String canIvote = age > 18 ? "Yes" : "No";
	    System.out.println(canIvote);
	}

}
