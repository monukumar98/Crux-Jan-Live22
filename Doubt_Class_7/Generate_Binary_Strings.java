package Doubt_Class_7;

import java.util.Scanner;

public class Generate_Binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			String str = sc.next();
			BinaryStrings(str, "");
			System.out.println();
		}

	}

	public static void BinaryStrings(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);
		if (ch == '?') {
			BinaryStrings(ques.substring(1), ans + "0");
			BinaryStrings(ques.substring(1), ans + "1");
		} else {
			BinaryStrings(ques.substring(1), ans + ch);
		}
	}

}
