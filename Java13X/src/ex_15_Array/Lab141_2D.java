package ex_15_Array;

public class Lab141_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1, 2, 3
		// 4, 5, 6
		// 7, 8, 9
		
		int [][] array_2d = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		// 10, 20,
		//  30, 40
		// 50, 60
		
		int [][] array;
		array = new int[][] {
			{ 10, 20},
			{30, 40},
			{50, 60}
		};
		
		int[][] array_2d_new = new int[3][3];
		array_2d_new[0][0] = 1;
		array_2d_new[0][1] = 2;
		array_2d_new[0][2]	= 3;  
		
		array_2d_new[1][0] = 3;
		array_2d_new[1][1] = 4;
		array_2d_new[1][2] = 7;
		
		array_2d_new[2][0] = 8;
		array_2d_new[2][1] = 10;
		array_2d_new[2][2] = 5;
		
	}

}
