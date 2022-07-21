package Lec65;

import java.util.Scanner;

public class Preparing_Olympiad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int diff[] = new int[n];
		for (int i = 0; i < diff.length; i++) {
			diff[i] = sc.nextInt();

		}
		System.out.println(CountContest(diff, x, l, r));
	}

	public static int CountContest(int[] diff, int x, int l, int r) {

		int n = diff.length;
		int count = 0;
		for (int i = 0; i < (1 << n); i++) {
			if (FastCountSet(i) >= 2) {
				if (isvalidConets(diff, l, r, x, i)) {
					count++;
				}

			}

		}
		return count;

	}

	private static boolean isvalidConets(int[] diff, int l, int r, int x, int i) {
		// TODO Auto-generated method stub
		int total_diff = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int pos = 0;
		while (i > 0) {

			if ((i & 1) != 0) {
				total_diff += diff[pos];
				min = Math.min(min, diff[pos]);
				max = Math.max(max, diff[pos]);
			}
			i = i >> 1;
			pos++;

		}

		return total_diff >= l && total_diff <= r && (max - min) >= x;
	}

	public static int FastCountSet(int n) {

		int count = 0;
		while (n != 0) {

			count++;
			n = n & (n - 1);
		}
		return count;

	}

}
