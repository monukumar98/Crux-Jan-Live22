package Lec3;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		while (row <= 2 * n - 1) {

			int i = 1;
			while (i <= star) {
				System.out.print("*" + " ");
				i++;
			}

			// next row
			// mirror
			if (row < n) {
				star = star + 1;
			} else {
				star = star - 1;
			}
			row = row + 1;
			System.out.println();

		}
	}

}
