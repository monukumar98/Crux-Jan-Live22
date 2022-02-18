package Lec9;

public class Reversal_Algo_Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		RotateArray(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void RotateArray(int[] arr, int k) {
		k = k % arr.length;
		int n = arr.length;
		Reverse(arr, 0, n - k - 1);// 1st n-k element ko Reverse
		Reverse(arr, n - k, n - 1);// last k element ko reverse
		Reverse(arr, 0, n - 1);// hole array ko reverse

	}

	public static void Reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}
}
