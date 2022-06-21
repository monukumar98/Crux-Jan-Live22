package Doubt_Class_9;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			int n = sc.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			if(isvalid(arr)){
				System.out.println("Valid");
			}
			else {
				System.out.println("Invalid");
			}
			
			
		}
		

	}
	
	public static boolean isvalid(int [] arr) {
		LinkedList<Integer> ll = new LinkedList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==1) {
				ll.add(1);
			}
			else {
				if(ll.isEmpty()) {
					return false;
				}
				else {
					ll.remove();
				}
			}
			
		}
		return true;
		
		
	}

}
