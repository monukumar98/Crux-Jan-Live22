package Doubt_Class_9;

import java.util.*;

public class Balanced_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();

		if (isBalanced(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				}

				char top = stack.peek();
				if (ch == '}' && top == '{') {
					stack.pop();
				} else if (ch == ']' && top == '[') {
					stack.pop();
				} else if (ch == ')' && top == '(') {
					stack.pop();
				} else {
					return false;
				}

			}

		}

		return stack.size() == 0;

	}

}
