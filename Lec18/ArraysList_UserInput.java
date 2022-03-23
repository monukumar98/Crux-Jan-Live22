package Lec18;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ll = new ArrayList<>();
//		for (int i = 0; i < 4; i++) {
//			ll.add(sc.nextInt());
//		}
		while(true) {
			ll.add(90);
			System.out.println(ll);
		}
		
//		for (int i = 0; i <ll.size(); i++) {
//			System.out.println(ll.get(i));// arr[i]
//		}

	}

}
