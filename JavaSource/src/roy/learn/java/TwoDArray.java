package roy.learn.java;

public class TwoDArray {

	public static void main(String[] args) {

		// 2D array is collection of 1D Array

		int[][] myFirst2DArray = {
                { 3, 5, 1, 9 },
                { 10, 15, 3, 0  },
                { 1, 11, 31, 90 },
                { 2, 51, 1, 9 }
            };
		
		int sum =0;
		for (int row = 0; row < myFirst2DArray.length; row++) {
			for (int coloum = 0; coloum < myFirst2DArray[row].length; coloum++) {
				System.out.print(myFirst2DArray[row][coloum]+" ");
				sum+=myFirst2DArray[row][coloum];
			}
			System.out.println();
		}
		
		System.out.printf("\nThe additon of all element is %d",sum);
	}
}
