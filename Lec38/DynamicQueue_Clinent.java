package Lec38;

public class DynamicQueue_Clinent {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Display();
		dq.Enqueue(80);
		dq.Enqueue(90);
		dq.Display();
		System.out.println(dq.getfront());

	}

}
