package Doubt_Class_6;

import java.util.Scanner;

public class Non_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();

			System.out.println(Non_Repeating(str));

		}

	}

	private static int Non_Repeating(String str) {
		// TODO Auto-generated method stub

		int si = 0;
		int ei = 0;
		int ans = 0;
		int frq[] = new int[256];

		while (ei < str.length()) {
			// window grow
			char ch = str.charAt(ei);
			frq[ch] = frq[ch] + 1;

			// window shrink
			while (frq[ch] > 1) {

				char c = str.charAt(si);
				frq[c] = frq[c] - 1;
				si++;
			}

			// ans calculate
			ans = Math.max(ans, ei - si + 1);

			ei++;

		}
		return ans;

	}

}
