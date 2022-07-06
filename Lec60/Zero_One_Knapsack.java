package Lec60;

import java.util.Arrays;

public class Zero_One_Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 4;
		int wt[] = { 1, 2, 3 };
		int val[] = { 3, 4, 1 };
		int[][] dp = new int[cap + 1][wt.length + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		// System.out.println(Knapsack(wt, val, cap, 0, dp));
		System.out.println(KnapsackBU(wt, val, cap));

	}

	public static int Knapsack(int wt[], int[] val, int cap, int i, int[][] dp) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		if (dp[cap][i] != -1) {
			return dp[cap][i];
		}
		int inc = 0;
		int exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + Knapsack(wt, val, cap - wt[i], i + 1, dp);// dp[cap-wt[i]][i+1]
		}
		exc = Knapsack(wt, val, cap, i + 1, dp);// dp[cap][i+1]
		return dp[cap][i] = Math.max(inc, exc);

	}

	public static int KnapsackBU(int wt[], int[] val, int cap) {
		int[][] dp = new int[cap + 1][wt.length + 1];
		for (int c = 1; c < dp.length; c++) {

			for (int i = 1; i < dp[0].length; i++) {
				int inc = 0;
				int exc = 0;
				if (c >= wt[i - 1]) {
					inc = val[i - 1] + dp[c - wt[i - 1]][i - 1];
				}
				exc = dp[c][i - 1];
				dp[c][i] = Math.max(inc, exc);
			}

		}
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}

		return dp[cap][wt.length];

	}

}
