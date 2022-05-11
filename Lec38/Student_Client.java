package Lec38;



public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Ram Lal", 78);
		// Object b = new Object();
		System.out.println(s);
		Student s1 = new Student("Ram Lali", 56);
		System.out.println(Student.count);
		Student.Hello();

	}

}
