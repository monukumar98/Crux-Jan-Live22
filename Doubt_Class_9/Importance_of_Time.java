package Doubt_Class_9;

import java.util.*;

public class Importance_of_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] call = new int[n];
		int[] ideal = new int[n];
		for (int i = 0; i < call.length; i++) {
			call[i] = sc.nextInt();
		}
		for (int i = 0; i < ideal.length; i++) {
			ideal[i] = sc.nextInt();
		}
		System.out.println(importanceOfTime(call, ideal));

	}

	private static int importanceOfTime(int[] call, int[] ideal) {
		int time = 0;
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		for (int i = 0; i < call.length; i++) {
			q1.add(call[i]);
		}
		for (int i = 0; i < ideal.length; i++) {
			q2.add(ideal[i]);
		}
		while (!q1.isEmpty()) {
			if (q1.peek() == q2.peek()) {
				time++;
				q1.poll();
				q2.poll();
			} else {
				int ii = q1.poll();
				q1.add(ii);
				time++;
			}

		}
		return time;
	}

}
