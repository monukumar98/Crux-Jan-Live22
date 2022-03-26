package Lec19;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		int flipa = maximumlength(str, k, 'a');
		int flipb = maximumlength(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int maximumlength(String str, int k, char ch) {// b
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		while (ei < str.length()) {
			// window grow
			if (str.charAt(ei) == ch) {
				flip++;
			}

			// window shrink
			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;

			}

			// ans calculate
			ans = Math.max(ans, ei - si + 1);

			ei++;

		}
		return ans;

	}

}
