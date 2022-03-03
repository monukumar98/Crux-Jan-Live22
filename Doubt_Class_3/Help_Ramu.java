package Doubt_Class_3;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();// Rickshaw
			int m = sc.nextInt();// Cab
			int[] rickshaw = new int[n];
			int[] cab = new int[m];
			for (int i = 0; i < rickshaw.length; i++) {
				rickshaw[i] = sc.nextInt();
			}
			for (int i = 0; i < cab.length; i++) {
				cab[i] = sc.nextInt();
			}

			int rickshaw_ride = 0;
			int cab_ride = 0;
			for (int i = 0; i < rickshaw.length; i++) {
				rickshaw_ride += Math.min(rickshaw[i] * c1, c2);

			}

			for (int i = 0; i < cab.length; i++) {
				cab_ride += Math.min(cab[i] * c1, c2);

			}
			rickshaw_ride = Math.min(rickshaw_ride, c3);
			cab_ride = Math.min(cab_ride, c3);
			int ans = Math.min(c4, cab_ride + rickshaw_ride);
			System.out.println(ans);

		}

	}

}
