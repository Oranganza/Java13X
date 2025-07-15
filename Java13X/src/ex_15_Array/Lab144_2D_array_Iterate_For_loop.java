package ex_15_Array;

public class Lab144_2D_array_Iterate_For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		// 3*3
		//R -> 3
		//C -> 3
		
		// 1, 2, 3
		// 4, 5, 6
		// 7, 8, 9
		System.out.println(matrix.length);
		// for row
		for(int i =0; i < matrix.length; i++) //0,1, 2
		{
			//for column
			for(int j=0; j <matrix[i].length; j++)// 0, 1, 2
			{
				System.out.print(matrix[i][j] + " | ");
			}
			System.out.println();
		}
	}

}
