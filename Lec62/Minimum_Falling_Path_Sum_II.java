package Lec62;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, minFallingPath(matrix, 0, i, dp));

		}
		System.out.println(ans);
	}

	private static int minFallingPath(int[][] matrix, int row, int col, int[][] dp) {
		// TODO Auto-generated method stub

		if (col < 0 || col >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (row == matrix.length - 1) {
			return matrix[row][col];

		}

		if (dp[row][col] != -1) {
			return dp[row][col];
		}

		int cost = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			if (i != col) {
				cost = Math.min(cost, minFallingPath(matrix, row + 1, i, dp));
			}
		}

		return dp[row][col] = matrix[row][col] + cost;
	}

}
