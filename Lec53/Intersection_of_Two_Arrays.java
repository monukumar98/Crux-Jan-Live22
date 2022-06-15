package Lec53;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 27, 27, 21, 3, 1, 4, 1, 33, 3, 4, 12, 5, 13, 4, 34, 3, 2, 12, 1, 1 };
		int[] arr2 = { 27, 21, 276, 26, 2, 4, 5, 7, 6, 2, 4, 34, 52, 12, 1, 1 };
		
		int [] arr = intersect(arr1, arr2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
				

	}

	public static int[] intersect(int[] arr1, int[] arr2) {

		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {

			if (map.containsKey(arr1[i])) {
				// int x = map.get(arr1[i]) + 1;
				map.put(arr1[i], map.get(arr1[i]) + 1);
			}

			else {
				map.put(arr1[i], 1);
			}

		}

		for (int i = 0; i < arr2.length; i++) {

			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}

		}

		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}

}
