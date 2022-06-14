package Lec52;

public class Path_Sum_III {

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
		public int pathSum(TreeNode root, int targetSum) {

			if (root == null) {
				return 0;
			}

			int root_sum = countnumberofpath(root, targetSum);// 10 Include

			int left = pathSum(root.left, targetSum);
			int right = pathSum(root.right, targetSum);
			return root_sum + left + right;

		}

		public int countnumberofpath(TreeNode root, int targetSum) {

			if (root == null) {
				return 0;
			}
			int ans = 0;
			if (targetSum - root.val == 0) {
				ans++;
			}
			ans = ans + countnumberofpath(root.left, targetSum - root.val);
			ans = ans + countnumberofpath(root.right, targetSum - root.val);
			return ans;

		}

	}

}
