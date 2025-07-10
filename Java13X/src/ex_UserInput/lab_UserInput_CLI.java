package ex_UserInput;

public class lab_UserInput_CLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  age_string = args[0];
		int age = Integer.parseInt(age_string);
		String canIvote = age > 18 ? "Yes" : "No";
		System.out.println(canIvote);
	}

}
 