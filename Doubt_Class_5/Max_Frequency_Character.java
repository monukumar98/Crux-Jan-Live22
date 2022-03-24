package Doubt_Class_5;

import java.util.Scanner;

public class Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Frequency_Character(str);

	}
	public static void Frequency_Character(String str) {
		int [] frq = new int [26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);//e
			frq[ch-97]= frq[ch-97]+1;
		}
		
		int max_i=0;
		for (int i = 1; i < frq.length; i++) {
			if(frq[i]>frq[max_i]) {
				max_i=i;
			}
		}
		char ch = (char) (97+max_i);
		System.out.println(ch);
		
	}

}
