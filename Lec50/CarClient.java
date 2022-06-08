package Lec50;

import java.util.*;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int [] arr = new int [7];
		Cars[] ar = new Cars[5];

		ar[0] = new Cars(200, 10, "White");
		ar[1] = new Cars(1000, 20, "Black");
		ar[2] = new Cars(345, 3, "Yellow");
		ar[3] = new Cars(34, 89, "Grey");
		ar[4] = new Cars(8907, 6, "Red");
		Display(ar);
		System.out.println("*********************");
		// Sort(ar, new CarCompareterSpeed());
		/// Sort(ar, new CarCOmparaterPrice());
		// Sort(ar, new CarComparaterColor());
		Arrays.sort(ar, new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o2.price - o1.price;
			}
		});
		Display(ar);

	}

	public static void Display(Cars[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}
	}

//	public static <T extends Comparable<T>> void Sort(T[] arr) {
//
//		// pass
//		for (int turn = 1; turn < arr.length; turn++) {
//
//			for (int i = 0; i < arr.length - turn; i++) {// 6-1
//				if (arr[i].compareTo(arr[i + 1]) > 0) {
//					T t = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = t;
//				}
//
//			}
//
//		}
//
//	}

	public static <T> void Sort(T[] arr, Comparator<T> camp) {

		// pass
		for (int turn = 1; turn < arr.length; turn++) {

			for (int i = 0; i < arr.length - turn; i++) {// 6-1
				if (camp.compare(arr[i], arr[i + 1]) > 0) {
					T t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}

			}

		}

	}

}
