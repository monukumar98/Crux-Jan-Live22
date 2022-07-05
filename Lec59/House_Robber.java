package Lec59;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 2, 1, 11 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(Robber(arr, 0, dp));

	}

	public static int Robber(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int rob = arr[i] + Robber(arr, i + 2, dp);// dp[i+2]
		int Do_ntrob = Robber(arr, i + 1, dp);// dp[i+1];
		dp[i] = Math.max(rob, Do_ntrob);
		return Math.max(rob, Do_ntrob);

	}

	public static int RobberBU(int[] arr) {

		int[] dp = new int[arr.length];

		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);

		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i - 2];
			int Do_ntrob = dp[i - 1];
			dp[i] = Math.max(rob, Do_ntrob);
		}
		return dp[arr.length - 1];

	}

}
