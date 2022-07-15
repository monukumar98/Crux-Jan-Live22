package Lec64;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println(Number(n));

	}

	public static int Number(int n) {
		int ans = 0;
		int mul = 5;
		while (n != 0) {
			if ((n & 1) != 0) {
				ans = ans + mul;
			}
			mul = mul * 5;
			n >>= 1;

		}
		return ans;

	}

}
