package Doubt_Class_7;

import java.util.Scanner;

public class Recursion_Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(TwinsCount(str));
	}
	
	public static int TwinsCount(String ques) {
		
		if(ques.length()<3) {
			return 0;
		}
		
		int count=0;
		if(ques.charAt(0)==ques.charAt(2)) {
			count++;
		}
		count = count + TwinsCount(ques.substring(1));
		return count;
		
		
	}

}
