package Lec54;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 2, 4, 5, 7, 8, 1, 3, 9, 11, 10, 16, 15, 1 };
		System.out.println(LongestSequence(arr));

	}

	public static int LongestSequence(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			} else {
				map.put(arr[i], true);
			}

			if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i] + 1, false);
			}

		}

		int ans = 0;
		for (int key : map.keySet()) {

			if (map.get(key) == true) {
				int count = 0;
				while (map.containsKey(key)) {
					count++;
					key++;
				}

				ans = Math.max(ans, count);

			}

		}
		return ans;

	}

}
