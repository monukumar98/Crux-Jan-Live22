package Lec21;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 13, 7, 5, 3, 4, 5, 6, 3, 9, 3 };
		System.out.println(FistIndex(arr, 0, 3));

	}

	public static int FistIndex(int[] arr, int i, int item) {
		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}

		return FistIndex(arr, i + 1, item);

	}

}
