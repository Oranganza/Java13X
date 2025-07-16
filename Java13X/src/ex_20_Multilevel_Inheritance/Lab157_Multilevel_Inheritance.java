package ex_20_Multilevel_Inheritance;

public class Lab157_Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandFather gf = new GrandFather();
		gf.gf();
		gf.car();
		
		System.out.println("---------");
		
		Father f = new Father();
		f.f();
		f.car();
		
		System.out.println("---------");
		Son s = new Son();
		System.out.println(s.gold);
		s.car();
		s.s();
		s.home();
		
	}

}
