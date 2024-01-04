package java_concepts;

public class Array4 {

	public static void main(String[] args) {
		
		//Defining multidimensional array
		int a[][] = {{5, 6, 8, 3}, {6, 9, 5, 3}, {8, 2, 0, 1}};
		
		//total number of rows
		int row = a.length;
		System.out.println("total rows :" + row);
		
		//total columns
		int col = a[0].length;
		System.out.println("total columns :" + col);
		
		//printing all data in matrix form
		
		for(int i =0; i < row; i++) {
			
			for(int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}

	}

}
