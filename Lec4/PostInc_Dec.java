package Lec4;

public class PostInc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		a++;// a= a+1;
		System.out.println(a);// 10

//		System.out.println(a++);//10
//	    int b=a++;
//		System.out.println(b);//11
//		System.out.println(a);//12

		int c = 11;
		c--;// c=c-1;

		int b= a++ - 9;
		System.out.println(b);
		System.out.println(a);

	}

}
