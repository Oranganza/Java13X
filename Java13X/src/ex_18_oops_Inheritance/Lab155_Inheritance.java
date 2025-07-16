package ex_18_oops_Inheritance;

public class Lab155_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Father f1 = new Father();
		System.out.println(f1.gold_f);
		f1.BHK2();
		
		Son s1 = new Son();
		System.out.println(s1.gold_f);
		s1.BHK2();
		s1.BHK3();
		
	}
}
		

	class Father
	{
		int gold_f = 1000;
		
		void BHK2()
		{
			System.out.println("Father - 2BHK");
		}
	}
		
		class Son extends Father
		{
			void BHK3()
			{
				System.out.println("Son - 3BHK");
			}
		}
	
	

