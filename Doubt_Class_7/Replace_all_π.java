package Doubt_Class_7;

import java.util.Scanner;

public class Replace_all_π {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			String str = sc.next();
			String ans = "";
			ans = ans + str.charAt(0);
			Replace_allPi(str.substring(1), ans);
		}

	}

	public static void Replace_allPi(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		if (ans.charAt(ans.length() - 1) == ques.charAt(0)) {

			Replace_allPi(ques.substring(1), ans.substring(0, ans.length()) + "3.14");

		} else {
			Replace_allPi(ques.substring(1), ans + ques.charAt(0));
		}

	}

}
