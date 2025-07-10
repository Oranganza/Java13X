package ex_14_StringBuilder_StringBuffer;

public class Lab126_stringBuilder_Vs_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Pramod";
		String s2 = new String("Pramod");
		
		StringBuffer stringBuffer = new StringBuffer("Pramod");
		StringBuilder stringbuilder = new StringBuilder("Pramod");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(stringBuffer);
		System.out.println(stringbuilder);
		
	}

}
