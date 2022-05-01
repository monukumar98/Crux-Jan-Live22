package Doubt_Class_8;

import java.util.Scanner;

public class SPlit_Array {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		subset(arr, 0, "", 0, "", 0);
		System.out.println(count);

	}

	public static void subset(int[] arr, int i, String ans, int sum, String ans1, int sum1) {
		if (i == arr.length) {
			if (sum == sum1) {
				System.out.println(ans + "and " + ans1);
				count++;
			}
			return;
		}

		subset(arr, i + 1, ans + arr[i] + " ", sum + arr[i], ans1, sum1);
		subset(arr, i + 1, ans, sum, ans1 + arr[i] + " ", sum1 + arr[i]);

	}

}
