package Lec13;

import java.util.Scanner;

public class Transpose_of_a_square_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();

			}

		}
		Tranpose(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void Tranpose(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = row + 1; col < arr.length; col++) {
				int temp = arr[row][col];
				arr[row][col] = arr[col][row];
				arr[col][row] = temp;

			}

		}
	}

}
