package ex_15_Array;

public class Lab147_Left_Hand_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
