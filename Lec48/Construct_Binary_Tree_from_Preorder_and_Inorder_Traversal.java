package Lec48;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return Create(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

		}

		private TreeNode Create(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
			// TODO Auto-generated method stub
			if (ilo > ihi || plo > phi) {
				return null;
			}

			TreeNode nn = new TreeNode(preorder[plo]);
			int i = Search(inorder, ilo, ihi, preorder[plo]);
			int nel = i - ilo;
			nn.left = Create(preorder, plo + 1, plo + nel, inorder, ilo, i - 1);
			nn.right = Create(preorder, plo + nel + 1, phi, inorder, i + 1, ihi);

			return nn;

		}

		public int Search(int[] inorder, int si, int ei, int item) {

			for (int i = si; i <= ei; i++) {
				if (inorder[i] == item) {
					return i;
				}
			}
			return -1;

		}
	}

}
