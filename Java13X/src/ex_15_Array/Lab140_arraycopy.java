package ex_15_Array;

public class Lab140_arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] original = {1, 2, 3};
		int[] copy =  new int[original.length];
		System.arraycopy(original, 0, copy, 0, original.length);
		//System.out.println(copy.length);
		
		
		
	}

}
