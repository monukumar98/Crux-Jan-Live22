package Lec36;

public class Persion_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Karan", 25);
		p.setName("Priya");
		p.setAge(-9);
		System.out.println(p.getAge());
		p.fun();
		Person p1 = new Person("Kumar", 24);

		p1.fun();

	}

}
