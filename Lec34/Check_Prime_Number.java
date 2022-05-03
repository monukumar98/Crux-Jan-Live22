package Lec34;

public class Check_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(isprime(89));
		for (int i = 2; i <= 100; i++) {
			if (isprime(i) == true) {
				System.out.print(i + " ");
			}

		}

	}

	// O(srt(N)
	public static boolean isprime(int n) {

		int div = 2;
		while (div * div <= n) {

			if (n % div == 0) {
				return false;
			}
			div++;

		}

		return true;

	}

}
