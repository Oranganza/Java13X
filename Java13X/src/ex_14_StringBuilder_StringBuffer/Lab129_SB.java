package ex_14_StringBuilder_StringBuffer;

public class Lab129_SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Java");
		sb.append("Programming");
		System.out.println(sb);
		sb.delete(4, 16);
		System.out.println(sb);
		sb.replace(0, 4, "C++");
		System.out.println(sb);
	}

}
