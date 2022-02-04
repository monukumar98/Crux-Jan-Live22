package Lec3;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = n;
		while (row <= 2 * n - 1) {

			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i = i + 1;
			}

			// star
			int j = 1;
			while (j <= star) {
				System.out.print("*" + " ");
				j = j + 1;
			}

			// next row
			// mirror
			if (row < n) {
				star = star - 1;
				space = space - 1;
			} else {
				star = star + 1;
				space = space + 1;
			}
			row=row+1;
			System.out.println();

		}

	}

}
