package Lec61;

import java.util.Arrays;
import java.util.Scanner;

public class Edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s1 = sc.next();
			String s2 = sc.next();
//			int[][] dp = new int[s1.length()][s2.length()];
//			for (int[] a : dp) {
//				Arrays.fill(a, -1);
//			}
//			System.out.println(editdistance(s1, s2, 0, 0, dp));
			System.out.println(editdistanceBU(s1, s2));
		}

	}

	public static int editdistance(String s1, String s2, int i, int j, int dp[][]) {
		if (i == s1.length()) {
			return s2.length() - j;
		}
		if (j == s2.length()) {
			return s1.length() - i;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = editdistance(s1, s2, i + 1, j + 1, dp);// dp[i-1][j-1]
		} else {
			int Delete = editdistance(s1, s2, i + 1, j, dp);// dp[i-1][]
			int Insert = editdistance(s1, s2, i, j + 1, dp);// dp[i][j-1]
			int Replace = editdistance(s1, s2, i + 1, j + 1, dp);// dp[i-1][j-1]
			ans = Math.min(Replace, Math.min(Insert, Delete)) + 1;
		}
		return dp[i][j] = ans;

	}

	public static int editdistanceBU(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 1; i < dp[0].length; i++) {
			dp[0][i] = i;

		}
		for (int i = 1; i < dp.length; i++) {
			dp[i][0] = i;

		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					ans = dp[i - 1][j - 1];
				} else {
					int Delete = dp[i - 1][j];
					int Insert = dp[i][j - 1];
					int Replace = dp[i - 1][j - 1];
					ans = Math.min(Replace, Math.min(Insert, Delete)) + 1;
				}
				dp[i][j] = ans;

			}

		}

		return dp[s1.length()][s2.length()];

	}

}
