package Lec43;


public class Cycle_Removal {

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
		this.tail.next = this.head.next.next;// cycle
	}

	public Node hasCycle() {
		Node fast = this.head;
		Node slow = this.head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return slow;
			}

		}

		return null;

	}

	public void removeCycl1() {

		Node meetup = hasCycle();
		if (meetup == null) {
			return;
		}
		Node start = head;
		while (start != null) {

			Node temp = meetup;
			while (temp.next != meetup) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;

		}

	}

	public void removeCycl2() {

		Node meetup = hasCycle();
		if (meetup == null) {
			return;
		}

		int count = 1;
		Node temp = meetup;
		while (temp.next != meetup) {
			count++;
			temp = temp.next;
		}
		// m step ahead
		Node fast = head;
		for (int i = 1; i <= count; i++) {
			fast = fast.next;
		}

		Node start = head;
		while (start.next != fast.next) {
			start = start.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void fylodcycleremoval() {
		Node meetup = hasCycle();
		if (meetup == null) {
			return;
		}
		Node fast = meetup;
		Node start = head;
		while (start.next != fast.next) {
			start = start.next;
			fast = fast.next;
		}
		fast.next = null;

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
		Cycle_Removal cl = new Cycle_Removal();
		cl.addlast(1);
		cl.addlast(2);
		cl.addlast(3);
		cl.addlast(4);
		cl.addlast(5);
		cl.addlast(6);
		cl.addlast(7);
		cl.addlast(8);
		cl.CreateCycle();
		cl.fylodcycleremoval();
		cl.Display();
	}

}
