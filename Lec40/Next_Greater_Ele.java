package Lec40;

import java.util.Stack;

public class Next_Greater_Ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 3, 23, 9, 15 };
		NGE(arr);

	}

	public static void NGE(int[] arr) {

		int[] nge = new int[arr.length];
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			// nge
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				int ii = st.pop();
				nge[ii] = arr[i];
			}

			st.push(i);

		}

		while (!st.isEmpty()) {
			int ii = st.pop();
			nge[ii] = -1;
		}

		for (int i = 0; i < nge.length; i++) {
			System.out.println(arr[i] + " " + nge[i]);

		}
	}

}
