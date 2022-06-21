package Doubt_Class_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import Doubt_Class_9.LevelOrdeLineWise.Node;

public class ArrayList_of_levels {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public ArrayList_of_levels() {
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

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> help = new LinkedList<>();
		ArrayList<Integer> ll = new ArrayList<>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		queue.add(this.root);// add last
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
				help = new LinkedList<>();
				ans.add(ll);// 1d list add 2 list 
				ll = new ArrayList<>();
			}

		}
		System.out.println(ans);

	}
}
