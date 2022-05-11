package Lec38;

public class Student {
	String name;
	int age;
	static int count = 0;

	public Student() {
		// TODO Auto-generated constructor stub
		count++;
	}

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
		count++;

	}

	@Override
	public String toString() {
		return this.name + " " + this.age;
	}

	public static void Hello() {
		System.out.println(" Hey ");
	}

	static {
		System.out.println("In Static ");
	}
}
