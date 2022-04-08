package Lec24;

public class Toh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		printSteps(n, "A", "B", "C");

	}

	public static void printSteps(int n, String s, String h, String d) {
		// TODO Auto-generated method stub
		// s is src h is helper and d is dis
		// s--> A h-->B   D-->c
		if(n==0) {
			return;
		}
		
		printSteps(n-1, s, d, h);//helper 
		System.out.println("Move "+n+"th disc form "+s+" to "+d);//
		printSteps(n-1, h, s, d);
		

	}

}
