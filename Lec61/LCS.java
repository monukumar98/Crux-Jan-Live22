package Lec61;

import java.util.Arrays;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "abcde";
		String text2 = "ace";
		int[][] dp = new int[text1.length()][text2.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(lcs(text1, text2, 0, 0, dp));
		System.out.println(lcsBU(text1, text2));

	}

	public static int lcs(String text1, String text2, int i, int j, int[][] dp) {
		if (i == text1.length() || j == text2.length()) {
			return 0;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (text1.charAt(i) == text2.charAt(j)) {
			ans = 1 + lcs(text1, text2, i + 1, j + 1, dp);// dp[i+1][j+1]
		} else {

			int fs = lcs(text1, text2, i + 1, j, dp);// dp[i+1][j]
			int ss = lcs(text1, text2, i, j + 1, dp);// dp[i][j+1]
			ans = Math.max(fs, ss);
		}
		return dp[i][j] = ans;

	}

	public static int lcsBU(String text1, String text2) {
		int[][] dp = new int[text1.length() + 1][text2.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
					ans = 1 + dp[i - 1][j - 1];
				} else {

					int fs = dp[i - 1][j];
					int ss = dp[i][j - 1];
					ans = Math.max(fs, ss);
				}
				dp[i][j] = ans;

			}
		}
		return dp[dp.length - 1][dp[0].length-1];

	}

}
