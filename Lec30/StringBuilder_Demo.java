package Lec30;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		System.out.println(sb);
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.length());
		sb = sb.reverse();
		System.out.println();
		sb.append("Hellooo");
		sb.append("HelloHelloHellooo");
		System.out.println(sb.length());
      
		String s = sb.toString();// builder to String
		System.out.println(sb);
		System.out.println(s);
		System.out.println(sb.capacity());

	}

}
