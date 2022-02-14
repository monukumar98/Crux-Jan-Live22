package Doubt_Class_1;

import java.util.Scanner;

public class Odd_and_Even_back_in_Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
		int n = sc.nextInt();
		int odd = 0;
		int even = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				even += rem;
			} else {
				odd += rem;
			}
			n = n / 10;
		}
		
		if(even%4==0 || odd%3==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
		}
		

	}

}
