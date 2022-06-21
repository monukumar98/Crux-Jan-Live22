package Doubt_Class_9;

import java.util.*;

public class PrintLeafNode {

	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public PrintLeafNode() {
		CreateTree();

	}

	private void CreateTree() {
		// TODO Auto-generated method stub
		Queue<Node> qq = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		this.root = nn;
		qq.add(nn);
		while (!qq.isEmpty()) {
			Node rv = qq.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node n = new Node();
				n.data = c1;
				rv.left = n;
				qq.add(n);
			}
			if (c2 != -1) {
				Node n = new Node();
				n.data = c2;
				rv.right = n;
				qq.add(n);
			}

		}

	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			System.out.print(node.data+" ");
			return;
		}
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public static void main(String[] args) {
		PrintLeafNode lbt = new PrintLeafNode();
		lbt.PreOrder();
	}

}