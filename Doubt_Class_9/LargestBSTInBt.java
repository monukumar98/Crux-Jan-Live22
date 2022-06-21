package Doubt_Class_9;

import java.util.Scanner;

public class LargestBSTInBt {
	public class Node {

		int val;
		Node left;
		Node right;

		Node() {
		}

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	private Node root;

	public void  buildTree(int[] preorder, int[] inorder) {
		this.root=Create(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

	}

	private Node Create(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
		// TODO Auto-generated method stub
		if (ilo > ihi || plo > phi) {
			return null;
		}

		Node nn = new Node(preorder[plo]);
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

	public class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		int size = 0;

	}
	
	public int validbst() {
		return validbst(root).size;
	}

	public BstPair validbst(Node root) {
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
			sbst.size = lbst.size + rbst.size + 1;
			return sbst;

		}

		sbst.isbst = false;
		sbst.max = Math.max(rbst.max, Math.max(lbst.max, root.val));
		sbst.min = Math.min(rbst.min, Math.min(lbst.min, root.val));
		sbst.size = Math.max(lbst.size, rbst.size);
		return sbst;

	}

	public static void main(String[] args) {
		LargestBSTInBt lbt = new LargestBSTInBt();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] preorder = new int [n];
		int [] inorder = new int [n];
		for (int i = 0; i < inorder.length; i++) {
			preorder[i]=sc.nextInt();
			
		}
		for (int i = 0; i < inorder.length; i++) {
			inorder[i]=sc.nextInt();
		}
		
		lbt.buildTree(preorder, inorder);
		System.out.println(lbt.validbst());
	}

}
