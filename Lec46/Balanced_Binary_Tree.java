package Lec46;

public class Balanced_Binary_Tree {
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

	public class BalancedPair {
		boolean isbal = true;
		int ht = -1;

	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			return isBalancedpair(root).isbal;

		}

		public BalancedPair isBalancedpair(TreeNode root) {
			if (root == null) {
				return new BalancedPair();
			}

			BalancedPair lbp = isBalancedpair(root.left);
			BalancedPair rbp = isBalancedpair(root.right);

			BalancedPair sbp = new BalancedPair();
			sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
			int bf = Math.abs(lbp.ht - rbp.ht);

			sbp.isbal = lbp.isbal && rbp.isbal && bf <= 1;
			return sbp;

		}
	}

}
