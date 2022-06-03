package Lec48;

public class Validate_Binary_Search_Tree {

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

	public class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;

	}

	class Solution {
		public boolean isValidBST(TreeNode root) {
			return validbst(root).isbst;

		}

		public BstPair validbst(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}
			BstPair lbst = validbst(root.left);
			BstPair rbst = validbst(root.right);

			BstPair sbst = new BstPair();
			if (lbst.isbst == true && rbst.isbst == true && lbst.max < root.val && rbst.min > root.val) {
				sbst.isbst = true;
				sbst.max = Math.max(rbst.max, root.val);
				sbst.min = Math.min(lbst.min, root.val);
				return sbst;

			}

			sbst.isbst = false;
			sbst.max = Math.max(rbst.max, Math.max(lbst.max, root.val));
			sbst.min = Math.min(rbst.min, Math.min(lbst.min, root.val));
			return sbst;

		}
	}

}
