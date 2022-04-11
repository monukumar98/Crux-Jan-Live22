package Doubt_Class_7;

import java.util.Scanner;

public class Nth_Triangle_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	}

	public static int CountTriangle(int n) {

		if (n == 0) {
			return 0;
		}
		int fn = CountTriangle(n - 1);
		return fn + n;
	}
}

