package Lec21;

public class Facto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n, 1));

	}

	public static int fact(int n, int ans) {
		// base case
		if (n == 0) {
			return ans;
		}
		// tail
		// sp n-1

		return fact(n - 1, ans * n);

	}

}
