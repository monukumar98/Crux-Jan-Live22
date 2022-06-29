package Lec56;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph_Bipartite {
	public class isBipartitePair {
		int vtx;
		int d;

		public isBipartitePair(int vt, int d) {
			// TODO Auto-generated constructor stub
			this.d = d;
			this.vtx = vt;
		}

	}

	class Solution {
		public boolean isBipartite(int[][] graph) {
			HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
			for (int i = 0; i < graph.length; i++) {
				map.put(i, new HashMap<>());

			}

			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph[i].length; j++) {
					map.get(i).put(graph[i][j], 0);
				}
			}
			return isBipartite(map);

		}

		public boolean isBipartite(HashMap<Integer, HashMap<Integer, Integer>> map) {
			LinkedList<isBipartitePair> qq = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();

			for (int src : map.keySet()) {
				if (visited.containsKey(src)) {
					continue;
				}
				isBipartitePair bp = new isBipartitePair(src, 0);
				qq.add(bp);
				while (!qq.isEmpty()) {
					// remove
					isBipartitePair r = qq.remove();
					// Ignore if Already Visited
					if (visited.containsKey(r.vtx) && r.d != visited.get(r.vtx)) {
						return false;
					}
					// visited mark
					visited.put(r.vtx, r.d);
				
					// nbrs add krna
					for (int nbrs : map.get(r.vtx).keySet()) {
						if (!visited.containsKey(nbrs)) {
							isBipartitePair nbp = new isBipartitePair(nbrs, r.d + 1);
							qq.add(nbp);
						}
					}

				}

			}
			return true;

		}
	}

}
