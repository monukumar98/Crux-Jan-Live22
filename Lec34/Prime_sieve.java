package Lec34;

public class Prime_sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primesieve(300);

	}

	public static void primesieve(int n) {
		// false --> number prime
		// true --> number not prime
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;// not prime
		prime[1] = true;// not prime

		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == false) {// i prime hai i ke multiples cut kro

				for (int mul = 2; mul * i <= n; mul++) {
					prime[i * mul] = true;// not prime
				}

			}

		}

		for (int i = 2; i <= n; i++) {
			if (prime[i] == false) {
				System.out.print(i+" ");
			}
		}

	}

}
