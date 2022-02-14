package Doubt_Class_1;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
//		double d = sc.nextDouble();
//		char ch = sc.next().charAt(0);
		long ans = 0;
		long mul = 1;
		while (n > 9) {
			int rem = (int) (n % 10);
			if (rem >= 5) {
				int t = 9 - rem;
				ans = ans + t * mul;

			} else {
				ans = ans + rem * mul;
			}
			mul = mul * 10;
			n /= 10;

		}

		if (n == 9 || n < 5) {
			ans = ans + n * mul;
		}

		else {

			int t = (int) (9 - n);
			ans = ans + t * mul;

		}

		System.out.println(ans);

	}

}
