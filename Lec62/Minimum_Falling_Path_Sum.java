package Lec62;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
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

	private static int minFallingPath(int[][] matrix, int i, int j, int[][] dp) {
		// TODO Auto-generated method stub

		if (j < 0 || j >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (i == matrix.length - 1) {
			return matrix[i][j];

		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int leftd = minFallingPath(matrix, i + 1, j - 1, dp);// (row + 1, col - 1)

		int down = minFallingPath(matrix, i + 1, j, dp);// (row + 1, col)

		int rightd = minFallingPath(matrix, i + 1, j + 1, dp);// (row + 1, col + 1)

		return dp[i][j] = matrix[i][j] + Math.min(down, Math.min(leftd, rightd));
	}

}
