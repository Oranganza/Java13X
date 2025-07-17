package ex_22_Oops_Polymorphism;

public class Lab159_Poly_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mathoprations m1 = new Mathoprations();
		int a1 = m1.add(4, 5);
		int a2 = m1.add(4, 5, 2);
		double a3 = m1.add(2.12, 1.5);
		String a4 = m1.add("Pramod", "Dutta");
		
		System.out.println(a1);
	}

}

//In same class when you have method with the same name methods
//but different arguments and different return type

 class Mathoprations
 {
	 int add(int a, int b)
	 {
		 return a+b;
	 }
	 
	 int add(int a, int b, int c)
	 {
		 return a+b+c;
	 }
	 
	 double add(double a, double b)
	 {
		 return a+b;
	 }
	 
	 String add(String a, String b)
	 {
		 return a+b;
	 }
 }


