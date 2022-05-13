package Lec39;

import Lec38.DynamicQueue;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);

		dq.Display();
		System.out.println("***************");
		Reverse(dq);
		dq.Display();

	}

	private static void Reverse(DynamicQueue dq) throws Exception {
		// TODO Auto-generated method stub
		if (dq.isEmpty()) {
			return;
		}

		int x = dq.Dequeue();
		Reverse(dq);
		dq.Enqueue(x);

	}

}
