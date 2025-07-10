package ex_08_Switch;

public class Lab0082_JDKabove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// in JDK  > 13
		// No need of break keyword
		// one line supported
		
		int itemcode = 002;
		switch (itemcode) {
		case 001 -> System.out.println("001");
		case 002 -> System.out.println("002");
		case 003 -> System.out.println("003");
		case 004 -> System.out.println("004");
		default -> System.out.println("Default");
		}
	}

}
