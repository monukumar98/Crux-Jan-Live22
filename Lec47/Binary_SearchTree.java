package Lec47;

public class Binary_SearchTree {

	public class Node {

		int data;
		Node left;
		Node right;

	}

	private Node root;

	public Binary_SearchTree(int[] in) {
		// TODO Auto-generated constructor stub

		this.root = CreateTree(in, 0, in.length - 1);
	}

	private Node CreateTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}

		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.data = in[mid];
		nn.left = CreateTree(in, si, mid - 1);
		nn.right = CreateTree(in, mid + 1, ei);

		return nn;
	}

}
