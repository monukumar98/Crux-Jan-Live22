package Doubt_Class_9;

import java.util.Scanner;

public class Add_duplicate {
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

	public void CreateTree(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			this.root = AddBst(root, arr[i]);
		}

	}

	private Node AddBst(Node node, int val) {
		// TODO Auto-generated method stub
		if (node == null) {
			Node n = new Node();
			n.val = val;
			return n;
		}

		if (val > node.val) {
			node.right = AddBst(node.right, val);
		} else {
			node.left = AddBst(node.left, val);
		}
		return node;
	}

	public void duplicate() {
		this.duplicate(this.root);
	}

	private void duplicate(Node node) {
		// base case
		if (node == null) {
			return;
		}
		Node nn = new Node();
		nn.val=node.val;
		nn.left = node.left;
        node.left=nn;

        duplicate(node.left.left);
        duplicate(node.right);
	}
	public void Display() {
		Display(this.root);
	}
	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		str = str + nn.val;
		str = " => " + str + " <= ";
		if (nn.left != null) {
			str = nn.left.val + str;
		} else {
			str = "END" + str;
		}
		if (nn.right != null) {
			str = str + nn.right.val;
		} else {
			str = str + "END";
		}
		System.out.println(str);
		Display(nn.left);// left subtree visit
		Display(nn.right);// right subtree visit

	}
	public static void main(String[] args) {
		Add_duplicate ad = new  Add_duplicate();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		ad.CreateTree(arr);
		ad.duplicate();
		ad.Display();
		
	}

}
