package Lec1;

public class Maximum_of_three_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 18;
		int b = 18;
		int c = 8;
		if (a >= b && a >= c) {
			System.out.println(a);
		}
		
		else if (b > c && b > a) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}

}
