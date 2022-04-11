package Doubt_Class_7;

import java.util.*;


public class Dictionary_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> list = new ArrayList<>();
		printPermutation(str, "",str,list);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public static void printPermutation(String ques, String ans, String org, ArrayList<String> list) {
		if (ques.length() == 0) {
			if (ans.compareTo(org) > 0) {
				// System.out.println(ans);
				list.add(ans);
			}
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);

			String ros = ques.substring(0, i) + ques.substring(i + 1);

			printPermutation(ros, ans + ch, org, list);

		}
	}

}
