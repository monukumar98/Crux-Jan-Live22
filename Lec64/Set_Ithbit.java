package Lec64;

public class Set_Ithbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 86;
		int pos = 3;
		System.out.println(setbit(n, pos));

	}

	public static int setbit(int n, int pos) {
		int mask = (1 << pos);
		return n | mask;
		

	}

}
