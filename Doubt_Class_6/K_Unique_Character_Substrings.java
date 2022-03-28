package Doubt_Class_6;

import java.util.Scanner;

public class K_Unique_Character_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			int k = sc.nextInt();
			System.out.println(K_Unique_Character(str, k));

		}

	}

	public static int K_Unique_Character(String str, int k) {
		int si = 0;
		int ei = 0;
		int ans = -1;
		int frq[] = new int[256];
		int Unique_count = 0;
		while (ei < str.length()) {
			// window grow
			char ch = str.charAt(ei);
			if (frq[ch] == 0) {
				Unique_count++;
			}
			frq[ch] = frq[ch] + 1;

			// window shrink
			while (Unique_count > k) {
				char c = str.charAt(si);
				frq[c] = frq[c] - 1;
				if (frq[c] == 0) {
					Unique_count--;
				}

			}

			// ans calculate
			if (Unique_count == k) {
				ans = Math.max(ans, ei - si + 1);
			}

			ei++;

		}
		return ans;
	}
}
