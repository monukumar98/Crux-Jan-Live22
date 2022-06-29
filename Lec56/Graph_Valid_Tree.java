package Lec56;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Graph_Valid_Tree {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new HashMap<>());

			}

			for (int i = 0; i < edges.length; i++) {
				int v1 = edges[i][0];
				int v2 = edges[i][1];
				map.get(v1).put(v2, 1);// v1--> map get kra then put v2 and Cost
				map.get(v2).put(v1, 1);

			}
			return isTree(map);

		}

		public boolean isTree(HashMap<Integer, HashMap<Integer, Integer>> map) {

			Stack<Integer> st = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			int count = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				count++;
				st.push(src);
				while (!st.isEmpty()) {
					// remove
					int r = st.pop();
					// Ignore if Already Visited
					if (visited.contains(r)) {
						return false;
					}
					// visited mark
					visited.add(r);
				
					// nbrs add krna
					for (int nbrs : map.get(r).keySet()) {
						if (!visited.contains(nbrs)) {
							st.push(nbrs);
						}
					}

				}
			}
			return count == 1;

		}
	}

}
