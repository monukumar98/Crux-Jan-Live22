package Lec42;

import Lec42.Middle_of_LinkedList.ListNode;

public class Linked_List_Cycle {

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

	}

	private Node head;
	private int size;
	private Node tail;

	public void addfrist(int item) {

		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;

		}

	}

	public void addlast(int item) {
		if (this.size == 0) {
			addfrist(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}

	}

	public void CreateCycle() {
		// this.tail.next = this.head.;// circular
		this.tail.next = this.head.next;// cycle
	}

	public boolean hasCycle() {
		Node fast = this.head;
		Node slow = this.head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return true;
			}

		}
		
		return false;

	}

	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public static void main(String[] args) {
		Linked_List_Cycle cl = new Linked_List_Cycle();
		cl.addlast(1);
		cl.addlast(2);
		cl.addlast(3);
		cl.addlast(4);
		cl.addlast(5);
		cl.addlast(6);
		cl.addlast(7);
		cl.addlast(8);
		//cl.Display();
		cl.CreateCycle();
		//cl.Display();
		System.out.println(cl.hasCycle());

	}

}
