package Lec64;

public class Single_Number_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 3, 4, 2, 7 };
		singleNumber(arr);

	}

	public static void singleNumber(int[] arr) {

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}

		int mask = ans & (~(ans - 1));
		int b = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & mask) != 0) {
				b = b ^ arr[i];
			}

		}
		int a = ans ^ b;

		System.out.println(a + " " + b);
	}

}
