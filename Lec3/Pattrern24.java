package Lec3;

import java.util.Scanner;

public class Pattrern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n - 1;
		int star = 1;
		int row = 1;
		while (row <= n) {

			// space

			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i = i + 1;
			}

			// star
			int j = 1;
			while (j <= star) {
				System.out.print(row + " ");
				j = j + 1;
			}
			// next row
			space = space - 1;
			star = star + 2;
			row = row + 1;
			System.out.println();

		}


	}

}
