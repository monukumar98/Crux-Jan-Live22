package Lec38;

public class DynmaicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		System.out.println(ds.peek());
		ds.push(60);
		ds.Display();
		ds.push(100);
		ds.push(200);
		ds.push(300);
		ds.push(400);
		ds.push(500);
		ds.Display();

	}

}
