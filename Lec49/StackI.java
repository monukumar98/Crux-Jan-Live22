package Lec49;

public  interface StackI extends DSAI,DynamicStackI{
	
	public  void push();
	public int pop();
	public int size();
	
	int val=9;// public static final 
	
	public static void Sayhey1() {
		System.out.println("hey");
	}
	
	private int fun1() {
		return 9;
	}


}
