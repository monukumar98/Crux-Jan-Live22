package Doubt_Class_3;

import java.util.Scanner;

public class Maximum_Circular_Sum {

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
			System.out.println(maximumsum(arr));

		}
	}

	public static int maximumsum(int[] arr) {
		int linear_kadane = Kadane(arr);

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			arr[i] = arr[i] * -1;

		}

		int Inverted_kadane = Kadane(arr);// 12

		int Cirl_kadane = Inverted_kadane + sum;
		return Math.max(linear_kadane, Cirl_kadane);

	}

	public static int Kadane(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int prevsum = 0;
		for (int i = 0; i < arr.length; i++) {
			prevsum += arr[i];
			ans = Math.max(ans, prevsum);

			if (prevsum < 0) {
				prevsum = 0;
			}
		}
		return ans;

	}

}
