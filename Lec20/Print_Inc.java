package Lec20;

public class Print_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PI(5);

	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);

	}

}
