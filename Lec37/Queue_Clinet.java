package Lec37;

public class Queue_Clinet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue qq = new Queue();
		qq.Enqueue(10);
		qq.Enqueue(20);
		qq.Enqueue(30);
		qq.Enqueue(40);
		qq.Display();
		System.out.println(qq.Dequeue());
		System.out.println(qq.Dequeue());
		qq.Display();
		qq.Enqueue(50);
		qq.Enqueue(60);
		qq.Enqueue(70);
		qq.Display();

	}

}
