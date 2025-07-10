package ex_08_Switch;

public class Lab0083_JDK1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int itemcode = 003;
		
		switch(itemcode) {
		case 001, 002, 003:
			System.out.println("All of them are electric gadgets");
		break;
		
		case 004, 005, 006:
			System.out.println("This are the mech gadgets");
		break;
		
		default:
			System.out.println("None");
		}
	}

}
