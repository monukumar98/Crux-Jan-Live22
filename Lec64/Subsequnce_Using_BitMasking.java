package Lec64;

public class Subsequnce_Using_BitMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		Subsequnce(str);

	}

	public static void Subsequnce(String str) {

		for (int i = 0; i < 1 << str.length(); i++) {
			print_pattren(i, str);

		}

	}

	private static void print_pattren(int i, String str) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i != 0) {

			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			i >>= 1;
		}
		System.out.println();

	}

}
