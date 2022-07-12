package Lec62;

import java.util.Arrays;

public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}

		System.out.println(minpathsum(grid, 0, 0, dp));

	}

	public static int minpathsum(int[][] grid, int i, int j, int[][] dp) {

		if (i == grid.length - 1 && j == grid[0].length - 1) {
			return grid[i][j];
		}
		if (i >= grid.length || j >= grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int v = minpathsum(grid, i + 1, j, dp);
		int h = minpathsum(grid, i, j + 1, dp);
		return dp[i][j] = grid[i][j] + Math.min(v, h);

	}

}
