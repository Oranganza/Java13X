package ex_03_literal;

public class lab0034_Char_Literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'A';
		char c2 = 'B';
		char c3 = '@';
		char c4 = '-';
		char c5 = '9';
		char c6 = '1';
		char c7 = '(';
		
		
		//Eascape Char
		
		char new_line = '\n';
		char tab_line = '\t';
		char back_space = '\b';
		char carriage_return = '\r';
		
		System.out.println("storyteller");
		System.out.println("Story"+new_line+"teller"); // 
		System.out.println("Story"+tab_line+"teller");
		System.out.println("Story"+back_space+"teller");
		System.out.println("Story is bad"+'\r'+"teller");
		
	}

}
