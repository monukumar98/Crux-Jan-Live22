package Lec46;

public class LCA {
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
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			if (root == null) {
				return null;
			}

			if (root == p || root == q) {
				return root;
			}

			TreeNode left = lowestCommonAncestor(root.left, p, q);
			TreeNode right = lowestCommonAncestor(root.right, p, q);
			if (left != null && right != null) {
				return root;
			}
			if(left==null) {
				return right;
			}
			else {
				return left;
			}

		}
	}
}
