package ex_05_Typecasting;

public class Lab0058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int course = 100;
		float GST = 18.45f;
		//int total = course+GST; //Narrow implicit
		
		int total1 = course + (int)GST ;// Narrow Explicit
		System.out.println(total1);
		
		
		float total2 = course +  GST; // widening auto-implicit
		float total3 = (float)course + GST;// Widening explict
		System.out.println(total3);
		System.out.println(total2);
	}

}
