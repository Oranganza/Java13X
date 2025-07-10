package ex_13_String;

public class Lab122_InterviewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//How many string constant
		String s1 = "Hello";
		String s5 = "Hello";
		String s7 = "Hello";
		String s10 = "Hello";
		
		String s2 = new String("Hello");
		String s3 = new String("Hello");
		String s4 = new String("hello");
		// SCP(String Constant Pool)
		// SCP | OP
		// 1   | 3 -> 4
		
		System.out.println(s1 == s3);
		System.out.println(s4 == s3);
		System.out.println(s2 == s3);
		System.out.println(s1 == s10);
		
		//Equals(content -> value)
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//equalsIgnorecase -> pramod, PRAMOD, Pramod, PRamod -> Pramod
		// == - check for the ref
		// = assignment the value
		
		
	}

}
