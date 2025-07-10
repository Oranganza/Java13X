package ex_13_String;

public class Lab124_string_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Sonal";
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(4));
		//System.out.println(name.charAt(10));
		System.out.println(name.concat("Patel"));
		System.out.println(name.contains("om"));
		System.out.println(name.equals("Sonal"));
		System.out.println(name.indexOf("n"));
		
		String s1 = "madam";
		// Returns the index within this string of the
		// first occurance of the specified substring
		System.out.println(s1.indexOf("m"));
		
		System.out.println(s1.lastIndexOf("m"));
		
		//replace();
		System.out.println(name.replace('a', 'A'));
		
		//split()
		String name4 = "pramod@live.com@123";
		String[] split_name4 = name4.split("@");
		System.out.println(split_name4[0]);
		System.out.println(split_name4[1]);
		System.out.println(split_name4[2]);
		
		//substring( , )
		System.out.println(name.substring(1, 3));
		
		//toUppercase
		System.out.println(name.toUpperCase());
		
		//toLowercase
		System.out.println("Sonal".toLowerCase());
		
		//startswith
		System.out.println(name.startsWith("S"));
		
		//endwith
		System.out.println(name.endsWith("a"));
		
		
		String anotherPalindrome = "Niagara. 0 roar again! ";
		System.out.println(anotherPalindrome.length());
		
		String extract = anotherPalindrome.substring(11, 15);
		System.out.println(extract);
		
		//Concatenation
		
		String s111 = "Hello"; 
		String s222 = "World";
		String s333 = "Jiii";
		String result1 = s111 + s222 +s333;
		System.out.println(result1);
		
		//trim()
		
		String s11 = " Hello ";
		String s2 = s11.trim();
		System.out.println(s2);
		
				
		
	}

}
