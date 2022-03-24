package Doubt_Class_5;

import java.util.Scanner;

public class Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		PrintString(str);

	}

	public static void PrintString(String str) {
		String ans = "";
		ans = ans + str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				System.out.println(ans);
				ans = "";
				ans = ans + ch;
			} else {
				ans = ans + ch;
			}

		}
		System.out.println(ans);

	}

}
