package Doubt_Class_7;

import java.util.Scanner;

public class SubSet_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int taerget = sc.nextInt();
		System.out.println("\n"+printSubSet(arr, 0, "", 0, taerget));

	}

	public static int printSubSet(int[] arr, int i, String ans, int sum, int target) {
		if (i == arr.length) {
			if (sum == target) {
				System.out.print(ans);
				return 1;
				
			}
			return 0;
		}

	int fs=	printSubSet(arr, i + 1, ans + arr[i] + " ", sum + arr[i], target);// element add

	int ss=	printSubSet(arr, i + 1, ans, sum, target);// no element added
		return fs+ss;
	}

}
