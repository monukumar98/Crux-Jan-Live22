package Lec22;

public class Coin_Toss_without2Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		CoinToss(n, "");

	}

	public static void CoinToss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (ans.length()==0  || ans.charAt(ans.length() - 1) != 'H') {
			CoinToss(n - 1, ans + "H");

		}
		
		CoinToss(n - 1, ans + "T");

	}

}
