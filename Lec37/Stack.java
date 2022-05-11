package Lec37;

public class Stack {
	protected int[] data;
	private int top = 0;

	public Stack() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
	}

	public Stack(int cap) {
		// TODO Auto-generated constructor stub
		this.data = new int[cap];
	}

	public boolean isEmpty() {
		return top == 0;

	}

	public boolean isfull() {
		return this.top == this.data.length;

	}

	public void push(int item) throws Exception {
		if (isfull()) {

			throw new Exception("Sun be Pgl hai ??, Stack full hogya");
		}

		this.data[this.top] = item;
		this.top++;

	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Sun be Pgl hai ??, Stack Empty h");

		}
		this.top--;// top= top-1;
		return this.data[this.top];
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Sun be Pgl hai ??, Stack Empty h");

		}
		return this.data[this.top - 1];
	}

	public int size() {
		return this.top;
	}

	public void Display() {
		for (int i = 0; i < top; i++) {
			System.out.print(this.data[i] + " ");

		}
		System.out.println();
	}

}
