package Lec38;

public class Method_OverLoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 4));
		System.out.println(add(2, 4, 9));
		System.out.println(add(2, 4, 9.7));
		System.out.println(add(-2, 3, 4, 5, 5, 6, 7, 7, 8, 11, 8, 8, 11, 8, 8, 8, 1));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

//	public static int add(int... a) {
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum = sum + a[i];
//
//		}
//		return sum;
//	}
	public static int add(int b, int c,int... a) {
		System.out.println(b);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		return sum;
	}

}
