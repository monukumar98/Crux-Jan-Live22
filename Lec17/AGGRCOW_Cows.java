package Lec17;

import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			// stall -- > n
			int nos = sc.nextInt();// number of stall
			int noc = sc.nextInt();// number of cows
			int[] stall = new int[nos];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}

			Arrays.sort(stall);
			System.out.println(LargestMinDistance(stall, noc));

		}

	}

	public static int LargestMinDistance(int[] stall, int noc) {
		int lo = 0;
		int hi = stall[stall.length - 1] - stall[0];// 9-1
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossilbe(stall, mid, noc) == true) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;

	}

	public static boolean isitpossilbe(int[] stall, int mid, int noc) {
		// TODO Auto-generated method stub

		int cows = 1;// count of cow
		int position = stall[0];
		int i = 1;
		while (i < stall.length) {
			if (stall[i] - position >= mid) {
				cows++;
				position = stall[i];

			}

			if (cows == noc) {
				return true;
			}
			i++;

		}
		return false;

	}

}
