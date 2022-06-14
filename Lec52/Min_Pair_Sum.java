package Lec52;

import java.util.PriorityQueue;

public class Min_Pair_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 4, 5, 6, 7, 82, 3, 5, 6, 1, 3 };
		System.out.println(Pair_Sum(arr));

	}

	public static int Pair_Sum(int[] arr) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}

		int sum = 0;
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			sum += a + b;
			pq.add(a + b);
		}
		return sum;

	}

}
