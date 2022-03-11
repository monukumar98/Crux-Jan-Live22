package Lec16;

import java.util.Scanner;

public class Playing_with_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(PlayingWithGoodString(str));

	}

	public static int PlayingWithGoodString(String str) {
		int ans=0;
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(vowels(ch)==true) {
				count++;
			}
			else {
				ans = Math.max(ans, count);
				count=0;
			}
			
		}
		ans = Math.max(ans, count);
		return ans;

	}
	
	public static boolean vowels(char ch) {
		if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u') {
			return true;
		}
		return false;
	}

}
