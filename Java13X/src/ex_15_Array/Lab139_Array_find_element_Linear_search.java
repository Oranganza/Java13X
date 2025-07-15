package ex_15_Array;

public class Lab139_Array_find_element_Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {23, 43, 45, 67, 87, 90};
		//find the target 67, give index?
		
		int target = 67;
		for(int i =0 ; i < a.length; i++)
		{
			if(target == a[i])
			{
				System.out.println(i);
			}
		}
	}

}
