package ex_UserInput;

import java.util.Scanner;

public class lab_userinput_Scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name");
        String string_name = scanner.next();
        System.out.println(string_name);
        
        System.out.println("Enter the number");
        int int_input = scanner.nextInt();
        System.out.println(int_input);
        
        System.out.println("Enter the double_number");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);
	}

}
