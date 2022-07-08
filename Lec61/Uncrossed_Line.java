package Lec61;

public class Uncrossed_Line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	  public static int lcsBU(int [] text1,  int [] text2) {
			int[][] dp = new int[text1.length + 1][text2.length + 1];
			for (int i = 1; i < dp.length; i++) {
				for (int j = 1; j < dp[0].length; j++) {
					int ans = 0;
					if (text1[i-1] == text2[j-1]) {
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
