package Doubt_Class_5;

import java.util.Scanner;

public class Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Toggle(str);

	}

	public static void Toggle(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z') {
				ans = ans + (char)(ch+32);
			}
			else {
				ans = ans + (char)(ch-32);
			}

		}
		System.out.println(ans);
	}

}
