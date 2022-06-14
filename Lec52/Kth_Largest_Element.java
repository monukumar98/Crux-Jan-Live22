package Lec52;

import java.util.*;

public class Kth_Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
		// PriorityQueue<Integer> pq1 = new
		// PriorityQueue<>(Collections.reverseOrder());// max heap
		int[] arr = { 2, 3, 4, 5, 1, 2, 4, 5, 3, 13, 4, 4, 6, 6, 6, 7, 7, 6, 11, 12, 5, };
		int k = 3;
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);// pq me add krega

		}

		for (int i = k; i < arr.length; i++) {
			if (pq.peek() < arr[i]) {// peek top ka value
				pq.poll();// remove
				pq.add(arr[i]);

			}

		}
		
		System.out.println(pq.peek());

	}

}
