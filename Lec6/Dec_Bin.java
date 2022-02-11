package Lec6;

public class Dec_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 45;
		int mul = 1;
		int ans = 0;
		while (n > 0) {
			int rem = n % 2;
			ans = ans + rem * mul;
			mul = mul * 10;
			n /= 2;

		}
		System.out.println(ans);

	}

}
