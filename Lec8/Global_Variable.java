package Lec8;

public class Global_Variable {

	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hey");
		int x = 60;
		System.out.println(val);
		fun(x);
		System.out.println(val);

	}

	public static void fun(int x) {
		int a = 90;
		System.out.println(x);
		// int val = 19;
		val = 120;
		System.out.println(val);
	}

//	public static void fun1(int x) {
//		int a2 = 80;
//		System.out.println(x);
//	}

}
