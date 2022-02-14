package Doubt_Class_1;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test--  > 0) {

			int m = sc.nextInt();// Aayush
			int n = sc.nextInt();// Harshit
			int Aayush_total_phone = 0;
			int Harshit_toatal_phone = 0;
			int curr = 1;
			while (true) {
				Aayush_total_phone += curr;

				if (Aayush_total_phone > m) {
					System.out.println("Harshit");
					break;
				}

				curr++;
				Harshit_toatal_phone += curr;
				if (Harshit_toatal_phone > n) {
					System.out.println("Aayush");
					break;
				}
				curr++;

			}
			
		}

	}

}
