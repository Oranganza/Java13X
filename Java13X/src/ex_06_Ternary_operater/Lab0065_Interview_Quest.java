package ex_06_Ternary_operater;

public class Lab0065_Interview_Quest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// Find maximum between the 3 numbers
		
		int n1 = 5;
		int n2 = 8;
		int n3 = -10;
		
		//rough logic
		// n1 >n2 and n1 > n3 = n1
		// n2 > n1 and n3 >n1 = n2
		
		//int max = (n1 > n2) ? A : B;
		
		int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
		System.out.println(max);
		
	}

}
