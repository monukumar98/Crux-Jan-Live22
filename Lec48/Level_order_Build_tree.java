package Lec48;

import java.util.*;

public class Level_order_Build_tree {

	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public Level_order_Build_tree() {
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

		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}
	public static void main(String[] args) {
		Level_order_Build_tree lbt = new Level_order_Build_tree();
		lbt.PreOrder();
	}

}
