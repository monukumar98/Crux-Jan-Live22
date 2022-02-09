package Lec5;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int row = 0;
		int str = 0;

		while (row < n) {

			int i = 0;
			int ncr = 1;
			while (i <= str) {
				System.out.print(ncr + " ");
				ncr = ((row - i) * ncr) / (i + 1);
				i++;
			}
			row++;
			str++;
			System.out.println();

		}

	}

}
