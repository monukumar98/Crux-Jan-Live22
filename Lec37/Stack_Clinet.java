package Lec37;

public class Stack_Clinet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Stack s = new Stack();// 5 
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop());
		s.Display();
		System.out.println(s.peek());
		s.push(60);
		s.Display();
		//s.push(70);

	}

}
