package Lec12;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 8, 9, 12, 14, 15, 16, 17 };
		System.out.println(Search(arr, 8));

	}

	public static int Search(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				hi = mid - 1;
			} else {// arr[mid]<item
				lo = mid + 1;

			}

		}
		return -1;

	}

	public static int Search_For(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;
		for (; lo <= hi;) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				hi = mid - 1;
			} else {// arr[mid]<item
				lo = mid + 1;

			}

		}
		return -1;

	}

}
