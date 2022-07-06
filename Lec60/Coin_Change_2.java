package Lec60;

import java.util.Arrays;

public class Coin_Change_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[amount + 1][coins.length + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(CoinChanges(coins, amount, 0, dp));

	}

	public static int CoinChanges(int[] coin, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == coin.length) {
			return 0;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}
		int inc = 0;
		int exc = 0;
		if (amount >= coin[i]) {
			inc = CoinChanges(coin, amount - coin[i], i, dp);// dp[amount-coin[i]][i]
		}
		exc = CoinChanges(coin, amount, i + 1, dp);// dp[amount][i+1]

		return dp[amount][i] = inc + exc;

	}

	public static int CoinChangesBU(int[] coin, int amount) {
		int[][] dp = new int[amount + 1][coin.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}

		for (int am = 1; am < dp.length; am++) {
			for (int i = 1; i < dp[0].length; i++) {
				int inc = 0;
				int exc = 0;
				if (am >= coin[i - 1]) {
					inc = dp[am - coin[i - 1]][i];
				}
				exc = dp[am][i - 1];
				dp[am][i] = inc + exc;

			}
		}
		
		return dp[amount][coin.length];

	}

}
