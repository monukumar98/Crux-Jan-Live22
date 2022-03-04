package Lec15;

import java.util.Scanner;

public class Divisible_Subarrays_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(GoodSubArray(arr));

		}

	}

	public static long GoodSubArray(int[] arr) {
		int n = arr.length;
		long[] frq = new long[n];
		long sum = 0;
		frq[0] = 1;
		for (int i = 0; i < frq.length; i++) {

			sum = sum + arr[i];
			int idx = (int) (sum % n);
			if (idx < 0) {
				idx += n;
			}
			frq[idx] = frq[idx] + 1;

		}

		long ans = 0;
		for (int i = 0; i < frq.length; i++) {
			if (frq[i] >= 2) {
				ans = ans + (frq[i] * (frq[i] - 1)) / 2;
			}
		}
		return ans;

	}

}
