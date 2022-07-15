package Lec64;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(SaDDas(str));

	}

	public static int SaDDas(String str) {

		int n = str.length();
		int count = (1 << n) - 2;// 1 to n-1 len ke saare lucky number ka count h
		int pos = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '7') {
				count = count + (1 << pos);
			}
			pos++;

		}
		return count + 1;

	}

}
