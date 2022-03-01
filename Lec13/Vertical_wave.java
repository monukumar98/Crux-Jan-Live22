package Lec13;

public class Vertical_wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 12, 13, 15 } };
		print(arr);

	}

	public static void print(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {

			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			}

			else {
				for (int row = arr.length - 1; row >= 0; row--) {

					System.out.print(arr[row][col] + " ");
				}
			}

		}

	}

}


