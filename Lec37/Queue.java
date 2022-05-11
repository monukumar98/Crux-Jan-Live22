package Lec37;

public class Queue {
	protected int[] data;
	protected int front = 0;
	private int size = 0;

	public Queue() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
	}

	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		this.data = new int[cap];
	}

	public boolean isEmpty() {

		return this.size == 0;

	}

	public boolean isfull() {

		return this.size == this.data.length;

	}

	public int size() {
		return this.size;
	}

	public void Enqueue(int item) throws Exception {

		if (isfull()) {
			throw new Exception("Sun Pgl hai ?? Queue full hai ");
		}
		int i = (this.size + this.front) % this.data.length;
		this.data[i] = item;
		this.size++;

	}

	public int Dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Sun Pgl hai ?? Queue Khaali hai ");
		}

		int rv = this.data[this.front];
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return rv;

	}

	public int getfront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Sun Pgl hai ?? Queue Khaali hai ");
		}
		return this.data[this.front];

	}

	public void Display() {

		for (int i = 0; i < this.size; i++) {
			int idx = (this.front + i) % this.data.length;
			System.out.print(this.data[idx] + " ");

		}
		System.out.println();

	}

}
