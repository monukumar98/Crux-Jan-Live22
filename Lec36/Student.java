package Lec36;

public class Student {
	private String name = "kriti";
	private int age = 89;

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge1(int age) throws Exception {
		if (age < 0) {

			throw new Exception("pgl hai age -ve nhi hota");

		}
		this.age = age;

	}

	public void setAge(int age) {
		try {
			if (age < 0) {

				throw new Exception("pgl hai age -ve nhi hota");

			}

			this.age = age;
		}

		catch (Exception e) {
			// TODO: handle exception
			// System.out.println(e);
			e.printStackTrace();

		}

		finally {
			System.out.println(getName());
		}

	}

}
