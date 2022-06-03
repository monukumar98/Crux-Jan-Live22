package Lec48;

import java.util.*;

public class RightView {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		int max_depth;

		public List<Integer> rightSideView(TreeNode root) {
			max_depth = -1;
			List<Integer> ll = new ArrayList<>();
			View(root, ll, 0);
			return ll;

		}

		public void View(TreeNode root, List<Integer> ll, int curr_lev) {

			if (root == null) {
				return;
			}
			if (curr_lev > max_depth) {
				ll.add(root.val);
				max_depth = curr_lev;
			}

			View(root.right, ll, curr_lev + 1);
			View(root.left, ll, curr_lev + 1);

		}
	}

}
