package Doubt_Class_4;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		TargetSum(arr, target);

	}

	public static void TargetSum(int[] arr, int taregt) {

		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == taregt) {
				System.out.println(arr[i] + " and " + arr[j]);
				i++;
				j--;
			} else if (arr[i] + arr[j] > taregt) {
				j--;
			} else {
				i++;
			}
		}

	}

}
