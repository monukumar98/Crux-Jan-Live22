package Lec61;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 3, 2 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(ValentineMagic(boys, girls, 0, 0));

	}

	public static int ValentineMagic(int[] boys, int[] girls, int i, int j) {
         if(i==boys.length) {
        	 return 0;
         }
         if(j==girls.length) {
        	 return 1000000;
         }
         
		int sel = Math.abs(boys[i] - girls[j]) + ValentineMagic(boys, girls, i + 1, j + 1);
		int rej = ValentineMagic(boys, girls, i, j + 1);
		return Math.min(sel, rej);

	}

}
