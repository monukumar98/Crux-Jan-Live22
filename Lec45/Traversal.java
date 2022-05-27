package Lec45;

import java.util.LinkedList;
import java.util.Scanner;

public class Traversal {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public Traversal() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();

	}

	private Node CreateTree() {
		// TODO Auto-generated method stub

		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nn.left = CreateTree();// left subStree
		}

		boolean hlr = sc.nextBoolean();
		if (hlr == true) {
			nn.right = CreateTree();// right SubStree
		}
		return nn;

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

	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.data + " ");

	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		INOrder(node.left);
		System.out.print(node.data + " ");
		INOrder(node.right);

	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		// Queue<Node> queue = new LinkedList<>();
		queue.add(this.root);// add last
		while (!queue.isEmpty()) {
			Node rv = queue.remove();// remove first
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				queue.add(rv.left);
			}
			if (rv.right != null) {
				queue.add(rv.right);
			}

		}
		System.out.println();

	}

	public static void main(String[] args) {
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true
		// 70 false false false
		Traversal tt = new Traversal();
		tt.PreOrder();
		tt.POStOrder();
		tt.INOrder();
		tt.levelOrder();
	}

}
