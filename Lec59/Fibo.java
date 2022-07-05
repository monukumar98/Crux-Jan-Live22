package Lec59;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45;
		int[] dp = new int[n + 1];
		System.out.println(fiboTD(n, dp));
		// System.out.println(fibo(n));

	}

	public static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fn1 = fibo(n - 1);
		int fn2 = fibo(n - 2);

		return fn1 + fn2;

	}

	public static int fiboTD(int n, int dp[]) {
		if (n == 0 || n == 1) {
			return n;
		}
		// dp apply here
		if (dp[n] != 0) {
			return dp[n];
		}

		int fn1 = fiboTD(n - 1, dp);// dp[n-1]
		int fn2 = fiboTD(n - 2, dp);//dp[n-2]

		dp[n] = fn1 + fn2;// yaad kiye ho
		return fn1 + fn2;

	}

	public static int fiboBU(int n) {
		int[] dp = new int[n + 1];
		dp[0]=0;
		dp[1]=1;
		for (int i = 2; i < dp.length; i++) {
			dp[i]=dp[i-1]+dp[i-2];
			
		}
		return dp[n];
		
	}

}
