package Lec31;

public class Merege_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 3, 1, 15, 7, 1 };

		int[] ans = mergesort(arr, 0, arr.length - 1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");

		}

	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] a = new int[1];
			a[0] = arr[lo];
			return a;
		}

		int mid = (lo + hi) / 2;

		int[] fs = mergesort(arr, lo, mid);
		int[] ss = mergesort(arr, mid + 1, hi);
		return Merge_TwoSorted_Array(fs, ss);

	}

	public static int[] Merge_TwoSorted_Array(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0;// arr1
		int j = 0;// arr2
		int k = 0;// ans

		while (i < n && j < m) {

			if (arr1[i] <= arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}

		}
		while (i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}

		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;

	}
}
