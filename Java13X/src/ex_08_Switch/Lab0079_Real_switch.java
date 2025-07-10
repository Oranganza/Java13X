package ex_08_Switch;

import java.util.Scanner;

public class Lab0079_Real_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Web Automation
		// I will ask the user to give me the input from browser which he wants to use to
		// I will start the automation in that browser
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser, which you want start!");
		String browser = sc.next();
		browser = browser.toLowerCase(); // this is used to apply upper and lower case letter
		
		switch(browser) {
		
		case "chrome": 
			System.out.println("Starting the chrome" );
			System.out.println(".... ");
			break;
		
		case "Edge": 
			System.out.println("Starting the Edge" );
			System.out.println("TC1... ");
			break;
			
			default:
				System.out.println("Unable to find any browser");
			break;
			
		}
	}

}
