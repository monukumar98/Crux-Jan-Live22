package Lec19;

public class Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2, 3 };
		int k = 10;
		System.out.println(countnofSubarray(arr, k));

	}

	public static int countnofSubarray(int[] arr, int k) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int p = 1;
		while (ei < arr.length) {
			// window grow
			p = p * arr[ei];

			// window Small
			while (p >= k && si<=ei) {
				p = p / arr[si];
				si++;
			}

			// ans calculate
			ans = ans + ei - si + 1;
			ei++;

		}
		return ans;

	}

}
