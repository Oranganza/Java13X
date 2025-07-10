package ex_13_String;

public class Lab123_String_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
	}

}
