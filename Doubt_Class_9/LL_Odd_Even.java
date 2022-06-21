package Doubt_Class_9;

import java.util.*;

public class LL_Odd_Even {
	static class LinkedList {

		private class Node {

			int data;
			Node next;
		}

		private Node head;
		private Node tail;
		private int size;

		public int getFirst() throws Exception {
			if (this.size == 0)
				throw new Exception("linked list is empty");

			return head.data;
		}

		public int getLast() throws Exception {
			if (this.size == 0)
				throw new Exception("linked list is empty");

			return tail.data;
		}

		public void addLast(int item) {
			// create a new node
			Node nn = new Node();

			nn.data = item;
			nn.next = null;

			// update summary
			if (size == 0) {
				this.head = nn;
				this.tail = nn;
				size++;
			} else

			{
				this.tail.next = nn;
				this.tail = nn;

				size++;
			}

		}

		public void addFirst(int item) {
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			if (size == 0) {
				this.head = nn;
				this.tail = nn;
				size++;
			} else {
				nn.next = this.head;
				this.head = nn;
				size++;
			}

		}

		public int removeFirst() throws Exception {
			Node fn = this.head;

			if (this.size == 0)
				throw new Exception("linked list is empty");

			if (this.size == 1) {
				this.head = null;
				this.tail = null;
				size = 0;
			} else {
				Node np1 = this.head.next;
				this.head = np1;
				size--;
			}

			return fn.data;
		}

		public void partition() throws Exception {

			// Write your code here
			Node curr = this.head;
			Node odd = new Node();
			Node even = new Node();
			Node a = odd;
			Node b = even;
			while (curr != null) {
				if (curr.data % 2 == 0) {
					Node nn = new Node();
					nn.data = curr.data;
					even.next = nn;
					even = even.next;
				} else {
					Node nn = new Node();
					nn.data = curr.data;
					odd.next = nn;
					odd = odd.next;
				}
				curr = curr.next;

			}
			odd.next = b.next;
			this.head = a.next;
			this.tail = even;

		}

		public void display() {

			Node temp = this.head;

			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}

	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		int n = scn.nextInt();

		for (int j = 0; j < n; j++) {
			int item = scn.nextInt();
			ll.addLast(item);
		}

		ll.partition();
		ll.display();

	}
}
