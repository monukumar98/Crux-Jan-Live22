package Doubt_Class_1;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space1 = n - 1;
		int space2 = -1;
		int star = 1;
		int row = 1;
		int val = 1;
		while (row <= n) {

			// space-1
			int i = 1;
			while (i <= space1) {
				System.out.print("  ");
				i++;
			}

			// star-1
			int j = 1;
			int p = val;
			while (j <= star) {
				System.out.print(p + " ");
				p--;
				j++;
			}

			// space-2
			int k = 1;

			while (k <= space2) {
				System.out.print("  ");
				k++;
			}

			// star-2

			j = 1;
			p++;
			if (row == 1 || row == n) {
				j = 2;
				
			}
			while (j <= star) {
				System.out.print(p + " ");
				j++;
				p++;
			}

			// next row Prep
			if (row <= n / 2) {
				space1 -= 2;
				space2 += 2;
				val++;
				star++;
			} else {
				space1 += 2;
				star--;
				space2 -= 2;
				val--;
			}
			row++;
			System.out.println();

		}

	}

}
