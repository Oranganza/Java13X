package ex_12_Functions;

public class Lab115_UD_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. without argument / parameters without return type
		wp_wr_greet();
		
		// 2. without parameter with return type
		String msg = greet_with_hello_wp_with_return_type();
		System.out.println(msg);
		
		//3. with parameter and without return type
		greet_with_details("Kajal", 27, 50000);
		
		// 4. with parameters with return type
		int sum = sum_of_two_numbers(5,9);
		System.out.println(sum);
	}
		
		// Without parameters and without return type (Declear/Define)
		 static void wp_wr_greet()
		 {
			 System.out.println("---Type 1 - Without parameter without return type---");
			 System.out.println("Hi, How are you?");
		 }
		 
		 //without parameter and with return type
		 static String greet_with_hello_wp_with_return_type()
		 {
			 System.out.println("-- Type 2 - Without parameter but with return type--");
			 System.out.println("wp_With_RT");
			 return "Hi how are you?";
		 }
		 
		 // with parameter and without return type (use 90%)
		 static void greet_with_details(String name, int age, double salary)
		 {
			 System.out.println("Your name is ->" + name+ "\nYour age is ->" +age +"\nYour salary is->" +salary);
		 }
		 
		 //with parameters with return type
		 static int sum_of_two_numbers(int a, int b)
		 {
			 return a+b;
		 }
		 
	}


