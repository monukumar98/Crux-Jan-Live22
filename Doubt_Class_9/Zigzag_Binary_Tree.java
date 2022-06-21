package Doubt_Class_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Zigzag_Binary_Tree {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public Zigzag_Binary_Tree() {
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

	public void levelOrderZIGZAG() {
		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> help = new LinkedList<>();
		queue.add(this.root);// add last
		ArrayList<Integer> ll = new ArrayList<>();
		int level = 0;
		while (!queue.isEmpty()) {
			Node rv = queue.remove();// remove first
			ll.add(rv.data);
			if (rv.left != null) {
				help.add(rv.left);
			}
			if (rv.right != null) {
				help.add(rv.right);
			}
			if (queue.isEmpty()) {
				queue = help;
				System.out.println();
				help = new LinkedList<>();
				if (level % 2 == 0) {
					for (int val : ll) {
						System.out.print(val + " ");
					}
				} else {
					Collections.reverse(ll);
					for (int val : ll) {
						System.out.print(val + " ");
					}
				}
				ll = new ArrayList<>();
				level++;
			}

		}
		System.out.println();

	}
}
