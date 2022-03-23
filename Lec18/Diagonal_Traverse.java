package Lec18;

import java.util.ArrayList;
import java.util.Collections;

public class Diagonal_Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] findDiagonalOrder(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		int[] ans = new int[n * m];
		int i = 0;
		for (int d = 0; d < n + m - 1; d++) {
			int r = 0;
			int c = 0;
			if (d < m) {
				r = 0;
				c = d;
			} else {
				r = d - m + 1;
				c = m - 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while (r < n && c >= 0) {
				list.add(mat[r][c]);
				r++;
				c--;
			}
			if (d % 2 == 0) {
				Collections.reverse(list);
			}
			for (int val : list) {
				ans[i] = val;
				i++;
			}

		}
		return ans;

	}

}
