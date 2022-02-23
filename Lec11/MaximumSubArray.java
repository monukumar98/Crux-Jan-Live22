package Lec11;

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxsum(arr));

	}

	public static int maxsum(int[] arr) {
		int ans = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			int prevous_sum = 0;
			for (int j = i; j < arr.length; j++) {
				prevous_sum += arr[j];
				ans = Math.max(ans, prevous_sum);
			}
		}
		return ans;

	}

}
