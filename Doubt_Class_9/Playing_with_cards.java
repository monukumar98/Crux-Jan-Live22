package Doubt_Class_9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Playing_with_cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			st.push(sc.nextInt());
		}
		// System.out.println(st);
		Playingwithcards(st, q);

	}

	public static void Playingwithcards(Stack<Integer> st, int q) {
		Stack<Integer> A = new Stack<>();
		Stack<Integer> B = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		findPrimes(list);

		for (int i = 1; i <= q; i++) {
			int p = list.get(i - 1);
			while (!st.isEmpty()) {
				int ii = st.pop();
				if (ii % p == 0) {
					B.push(ii);
				} else {
					A.push(ii);
				}

			}

			while (!B.isEmpty()) {
				System.out.println(B.pop());

			}
			st = A;
			A = new Stack<>();

		}
		while (!st.isEmpty()) {
			System.out.println(st.pop());

		}
	}

	public static void findPrimes(ArrayList<Integer> primes) {
		boolean[] prime = new boolean[100001];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i * i <= 100000; i++) {
			if (prime[i] == false) {
				primes.add(i);
				for (int mul = 2; mul * i <= 100000; mul++) {
					prime[i * mul] = true;
				}
			}
		}
		for (int i = 2; i <= 100000; i++) {
			if (!prime[i]) {
				primes.add(i);
			}
		}
	}

}
