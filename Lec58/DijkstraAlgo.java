package Lec58;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;



public class DijkstraAlgo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public DijkstraAlgo(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void addEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}

	public class DijkstraPair {

		int vtx;
		String acqpath;
		int cost;

		public DijkstraPair(int vtx, String acqpath, int cost) {
			this.vtx = vtx;
			this.acqpath = acqpath;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " via " + this.acqpath + " @ " + this.cost;
		}

	}

	public void Dijkstra() {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {
			@Override
			public int compare(DijkstraPair p1, DijkstraPair p2) {
				return p1.cost - p2.cost;
			}

		});

		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(1, "1", 0));
		while (!pq.isEmpty()) {
			
			DijkstraPair dp = pq.remove();
			if(visited.contains(dp.vtx)) {
				continue;
			}
			visited.add(dp.vtx);
			System.out.println(dp);
			
			for(int nbrs : map.get(dp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int c= dp.cost+map.get(dp.vtx).get(nbrs);
					DijkstraPair ndp = new DijkstraPair(nbrs, dp.acqpath+nbrs, c);
					pq.add(ndp);
					
				}
			}

		}
	}
		public static void main(String[] args) {
			DijkstraAlgo pa = new DijkstraAlgo(7);
			pa.addEdge(1, 2, 2);
			pa.addEdge(2, 3, 3);
			pa.addEdge(1, 4, 10);
			pa.addEdge(4, 5, 8);
			pa.addEdge(3, 4, 1);
			pa.addEdge(5, 6, 5);
			pa.addEdge(5, 7, 6);
			pa.addEdge(6, 7, 4);
			pa.Dijkstra();

		}

	

}
