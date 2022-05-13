package Lec39;

import Lec38.DynamicStack;

public class Queue_Using_Stack {

	private DynamicStack data;

	public Queue_Using_Stack() {
		// TODO Auto-generated constructor stub
		this.data = new DynamicStack();
	}

	public boolean isEmpty() {
		return this.data.isEmpty();

	}

	public int size() {
		return this.data.size();
	}

	public void Enqueue(int x) throws Exception {
		this.data.push(x);

	}

	public int Dequeue() throws Exception {
		DynamicStack temp = new DynamicStack();
		while (this.data.size() != 1) {
			temp.push(this.data.pop());
		}
		int x = this.data.pop();
		while (temp.size() != 0) {
			this.data.push(temp.pop());
		}
		return x;

	}

	public int getFront() throws Exception {
		DynamicStack temp = new DynamicStack();
		while (this.data.size() != 1) {
			temp.push(this.data.pop());
		}
		int x = this.data.peek();
		while (temp.size() != 0) {
			this.data.push(temp.pop());
		}
		return x;

	}

}
