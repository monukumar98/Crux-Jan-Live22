package Lec57;

import java.util.*;

public class Kruskals_Algorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Kruskals_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public class EdgePair {

		int e1;
		int e2;
		int cost;

		public EdgePair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.cost = cost;
			this.e1 = e1;
			this.e2 = e2;
		}

		@Override
		public String toString() {
			return e1 + " - " + e2 + " @ " + cost;
		}

	}

	public ArrayList<EdgePair> getalledge() {
		ArrayList<EdgePair> list = new ArrayList<>();

		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {

				EdgePair eg = new EdgePair(e1, e2, map.get(e1).get(e2));
				list.add(eg);

			}

		}
		return list;
	}

	public void KruskalsAlgorithm() {
		int ans = 0;
		DisJointSet ds = new DisJointSet();
		for (int k : map.keySet()) {
			ds.CreateSet(k);

		}
		ArrayList<EdgePair> ll = getalledge();
		Collections.sort(ll, new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		for (EdgePair edge : ll) {
			int e1 = edge.e1;
			int e2 = edge.e2;
			int re1 = ds.find(e1);
			int re2 = ds.find(e2);
			if (re1 == re2) {
				// nothing
			} else {
				System.out.println(edge);
				ans += edge.cost;
				ds.union(re1, re2);
			}

		}
		System.out.println(ans);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Kruskals_Algorithm ks = new Kruskals_Algorithm(n);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			ks.addEdge(v1, v2, cost);
		}
		ks.KruskalsAlgorithm();
	}

}
