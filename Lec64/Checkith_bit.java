package Lec64;

public class Checkith_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 86;
		int pos = 0;
		System.out.println(isset(n, pos));

	}

	public static boolean isset(int n, int pos) {

		n = n >> pos;
		if ((n & 1) == 0) {
			return false;
		} else {
			return true;
		}

	}

}
