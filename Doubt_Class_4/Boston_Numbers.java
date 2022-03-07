package Doubt_Class_4;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(sunofdigit(n)==BostonNumber(n)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
	}

	public static int BostonNumber(int n) {

		int primefact = 0;
		for (int i = 2; i <= n; i++) {

			while (n % i == 0) {
				primefact = primefact + sunofdigit(i);
				n /= i;
			}

		}
		return primefact;

	}

	public static int sunofdigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;

	}

}
