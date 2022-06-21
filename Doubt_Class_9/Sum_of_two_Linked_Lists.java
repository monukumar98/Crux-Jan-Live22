package Doubt_Class_9;

import java.util.Scanner;

public class Sum_of_two_Linked_Lists {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public void addAtLast(int item) {
		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void reverse() {
		// TODO Auto-generated method stub
		reverse(head, null);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

	}

	private void reverse(Node curr, Node prev) {
		// TODO Auto-generated method stub
		if (curr == null) {
			return;

		}
		reverse(curr.next, curr);
		curr.next = prev;

	}

	public void sum(Sum_of_two_Linked_Lists two) {
		Node a = this.head;
		Node b = two.head;
		Node Dummy = new Node(0);
		Node temp = Dummy;
		int carry = 0;
		while (a != null || b != null) {
			int sum = carry;
			if (a != null) {
				sum += a.data;
				a = a.next;
			}
			if (b != null) {
				sum += b.data;
				b = b.next;
			}

			Node node = new Node(sum % 10);
			Dummy.next = node;
			Dummy = Dummy.next;
			carry = sum / 10;
		}
		if (carry > 0) {
			Node node = new Node(carry);
			Dummy.next = node;
			Dummy = Dummy.next;
		}
		this.head = temp.next;
		this.tail=Dummy;
		

	}

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Sum_of_two_Linked_Lists one = new Sum_of_two_Linked_Lists();
		int i = 0;
		while (i < n) {
			one.addAtLast(sc.nextInt());
			i++;
		}
		i = 0;
		Sum_of_two_Linked_Lists two = new Sum_of_two_Linked_Lists();
		while (i < m) {
			two.addAtLast(sc.nextInt());
			i++;
		}

		one.reverse();
		two.reverse();
		one.sum(two);
		one.reverse();
		one.display();
	}

}
