package Lec39;

import Lec38.DynamicQueue;

public class Stack_Using_Queue {

	private DynamicQueue data;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		this.data = new DynamicQueue();
	}

	public boolean isEmpty() {
		return this.data.isEmpty();
	}

	public int size() {

		return this.data.size();
	}

//O(N)
	public void push(int item) throws Exception {
		DynamicQueue temp = new DynamicQueue();
		while (!this.data.isEmpty()) {
			temp.Enqueue(data.Dequeue());
		}

		this.data.Enqueue(item);

		while (!temp.isEmpty()) {
			data.Enqueue(temp.Dequeue());
		}

	}

	public int pop() throws Exception {

		return this.data.Dequeue();
	}

	public int peek() throws Exception {

		return this.data.getfront();
	}

}
