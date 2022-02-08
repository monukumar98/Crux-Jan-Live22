package Lec4;

import java.util.Scanner;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int space = 0;
		int star = 2 * n + 1;
		int row = 1;
		int val = n;
		while (row <= 2 * n + 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int p = val;
			while (j <= star) {
				System.out.print(p + " ");
				if (j <= star / 2) {
					p--;
				} else {
					p++;
				}

				j++;
			}
			// next row
			if (row <= n) {
				space++;
				star -= 2;
				val--;
			} else {
				space--;
				star += 2;
				val++;
			}
			System.out.println();
			row++;

		}

	}

}
