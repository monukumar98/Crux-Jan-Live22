package Doubt_Class_1;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = n - 1;
		int row = 1;
		int val = 1;
		while (row <= 2 * n - 1) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star
			int j = 1;
			int p = val;
			while (j <= star) {
				System.out.print(p + " ");
				// Vertical Mirroring
				if (j <= star / 2) {
					p++;
				} else {
					p--;
				}
				j++;
			}

			// next Row Prep

			if (row < n) {
				space--;
				star += 2;
				val++;
			} else {
				space++;
				star -= 2;
				val--;
			}
			System.out.println();

			row++;
		}

	}

}
