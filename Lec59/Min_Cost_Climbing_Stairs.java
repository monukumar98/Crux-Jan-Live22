package Lec59;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(Helper(arr, dp));

	}

	public static int Helper(int[] arr, int[] dp) {
		int f = mincost(arr, 0, dp);
		int s = mincost(arr, 1, dp);
		return Math.min(f, s);
	}

	public static int mincost(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int first = mincost(arr, i + 1, dp);// dp[i+1]
		int second = mincost(arr, i + 2, dp);
		return dp[i] = Math.min(first, second) + arr[i];

	}
	public static int mincost(int[] arr) {
		
		int[] dp = new int[arr.length];
		dp[0]=arr[0];
		dp[1]=arr[1];
		int n = dp.length;
		for (int i = 2; i < dp.length; i++) {
			int first = dp[i-1];
			int second = dp[i-2];
			dp[i] = Math.min(first, second) + arr[i];
		}
	
	return Math.min(dp[n-1],dp[n-2]);
		

	}
}
