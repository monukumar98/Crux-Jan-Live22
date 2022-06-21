package Doubt_Class_9;

import java.util.*;

public class LL_k_Reverse {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public int size() {
		return this.size;
	}

	public void addLast(int data) {
		Node node = new Node(data, null);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}

		this.size++;
	}

	// O(n)
	public void display() {
		Node node = this.head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

		// System.out.println("END");
	}

	public void reverse(int k) {
		Node curr = this.head;
		Node dummy = new Node();
		Node temp = dummy;
		Stack<Node> st = new Stack<>();
		while (curr != null) {

			Node node = new Node();
			node.data = curr.data;
			st.push(node);
			if (st.size() == k) {
				while (!st.isEmpty()) {
					dummy.next = st.pop();
					dummy = dummy.next;
				}
			}
			curr = curr.next;

		}
		while (!st.isEmpty()) {
			dummy.next = st.pop();
			dummy = dummy.next;
		}
		this.head = temp.next;
		this.tail = dummy;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int k = scn.nextInt();

		LL_k_Reverse list = new LL_k_Reverse();

		for (int i = 0; i < N; i++) {
			list.addLast(scn.nextInt());
		}

		list.reverse(k);
		list.display();
	}
}
