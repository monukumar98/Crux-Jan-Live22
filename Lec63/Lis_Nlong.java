package Lec63;

public class Lis_Nlong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(lis(arr));

	}

	private static int lis(int[] arr) {
		// TODO Auto-generated method stub

		int[] ans = new int[arr.length];
		ans[0] = arr[0];
		int len = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > ans[len - 1]) {
				ans[len] = arr[i];
				len++;
			} else {
				int idx = BinarySearch(ans, 0, len - 1, arr[i]);
				ans[idx] = arr[i];
			}

		}
		return len;

	}

	private static int BinarySearch(int[] ans, int lo, int hi, int item) {
		// TODO Auto-generated method stub
		int idx = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (ans[mid] >= item) {
				idx = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}

		return idx;

	}

}
