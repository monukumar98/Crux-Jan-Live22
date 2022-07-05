package Lec58;

import java.util.*;

public class Prims {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}

	public class PrimsPair {

		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return this.vtx+" via "+ this.acqvtx+" @ "+this.cost;
		}

	}

	public void PrimsAlgo() {
        int ans=0;
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
			@Override
			public int compare(PrimsPair p1, PrimsPair p2) {
              return  p1.cost-p2.cost;
			}

		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			// remove
			PrimsPair pp = pq.remove();

			// ignore
			if (visited.contains(pp.vtx)) {
				continue;
			}
			// visited
			visited.add(pp.vtx);

			// print
			System.out.println(pp);
			ans+=pp.cost;

			// nbrs
			for (int nbrs : map.get(pp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					PrimsPair np = new PrimsPair(nbrs, pp.vtx, map.get(pp.vtx).get(nbrs));
					pq.add(np);
				}

			}

		}
		System.out.println(ans);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Prims pm = new Prims(n);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			pm.AddEdge(v1, v2, cost);
		}
		pm.PrimsAlgo();
	}

}
