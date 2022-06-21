package Doubt_Class_9;

import java.util.Scanner;
import java.util.Stack;

public class Kartik_Sir_and_Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int n = sc.nextInt();
		for (int i = 0; i <n; i++) {
			int e1 = sc.nextInt();
			if(e1==2) {
				int item = sc.nextInt();
				stack.push(item);
			}
			else {
				if(stack.isEmpty()) {
					System.out.println("No Code");
				}
				else {
					System.out.println(stack.pop());
				}
			}
			
		}

	}

}
