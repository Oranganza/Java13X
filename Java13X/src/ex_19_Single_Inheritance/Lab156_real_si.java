package ex_19_Single_Inheritance;

public class Lab156_real_si extends CommonToAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testcase1 t1 = new Testcase1();
		t1.runningTC1();
		
		CommonToAll c1 = new CommonToAll();
		Testcase1 t2 = new Testcase1();
		CommonToAll c2 = new Testcase1(); //Dynamic Dispatch (extends)
		
	}

}
