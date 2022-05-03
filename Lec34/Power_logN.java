package Lec34;

public class Power_logN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerlogn(2, 9));

	}

	public static int powerlogn(int a, int n) {
		if (n == 0) {
			return 1;
		}

		int ans = powerlogn(a, n / 2);

		ans = ans * ans;// a^n
		if (n % 2 != 0) {
			ans = ans * a;
		}
		return ans;

	}

}
