package Lec64;

public class CountSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 119;
		System.out.println(CountSet(n));

	}

	public static int CountSet(int n) {

		int count = 0;
		while (n != 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n >>= 1;// n= n>> 1;
		}
		return count;

	}

	public static int FastCountSet(int n) {

		int count = 0;
		while (n != 0) {

			count++;
			n = n & (n - 1);
		}
		return count;

	}

}
