package Doubt_Class_1;

import java.util.Scanner;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = 2 * n - 1;
		int row = 1;
		while (row <= 2 * n + 1) {
			// star
			int i = 1;
			int val = n;
			while (i <= star) {
				System.out.print(val + " ");
				val--;
				i++;
			}

			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// star
			int k = 1;
			val++;
			if (row == n + 1) {
				k = 2;
				val++;
			}
			while (k <= star) {
				System.out.print(val + " ");
				k++;
				val++;
			}

			// next Row Prep
			if (row <= n) {
				star++;
				space -= 2;
			} else {
				star--;
				space += 2;
			}
			System.out.println();
			row++;

		}

	}

}
