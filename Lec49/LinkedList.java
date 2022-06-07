package Lec49;
public class LinkedList<T>{

	public class Node {
		T data;
		Node next;

		public Node(T data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

	}

	private Node head;
	private int size;
	private Node tail;

	public void addfrist(T item) {

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

	public void addlast(T item) {
		if (this.size == 0) {
			addfrist(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}

	}

	public void addatindex(T item, int k) throws Exception {

		if (k < 0 || k > size) {
			throw new Exception("Index out of Bound pgl k ki value range me de");
		}
		if (k == 0) {

			addfrist(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node nn = new Node(item);
			Node k_1th = GetNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			this.size++;

		}

	}

	// get

	public T getfirst() throws Exception {
		if (this.head == null) {
			throw new Exception("pgl Linkedlsit khaali hai");
		}

		return this.head.data;
	}

	public T getlast() throws Exception {
		if (this.head == null) {
			throw new Exception("pgl Linkedlsit khaali hai");
		}

		return this.tail.data;
	}

	public T getatindex(int k) throws Exception {

		return GetNode(k).data;

	}

	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Index out of Bound pgl k ki value range me de");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;

		}
		return temp;

	}

	public T removeFisrt() throws Exception {
		if (this.head == null) {
			throw new Exception("pgl Linkedlsit khaali hai");
		}
		Node temp = this.head;
		this.head = this.head.next;
		temp.next = null;
		this.size--;
		return temp.data;

	}

	public T removelast() throws Exception {
		if (this.head == null) {
			throw new Exception("pgl Linkedlsit khaali hai");
		}
		if (this.size == 1) {
			return removeFisrt();
		}

		Node temp = GetNode(this.size - 2);// 40
		T rv = tail.data;// 50
		this.tail = temp;
		this.tail.next = null;
		this.size--;
		return rv;

	}

	public T removeatindex(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Index out of Bound pgl k ki value range me de");
		}

		if (k == 0) {
			return removeFisrt();
		} else if (k == this.size - 1) {
			return removelast();
		} else {
			Node kth = GetNode(k);
			Node k_1th = GetNode(k - 1);
			k_1th.next = kth.next;
			kth.next = null;
			this.size--;
			return kth.data;

		}

	}

	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

}