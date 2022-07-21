package Lec65;

public class Trieclint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.insert("apple");
		t.insert("go");
		t.insert("mango");
		t.insert("priya");
		t.insert("puneet");
		t.insert("raj");
		t.insert("ram");
		t.insert("rajesh");
		t.insert("gudi");
		t.insert("man");

		System.out.println(t.search("apple"));
		System.out.println(t.startsWith("app"));
		System.out.println(t.countword("app"));
		System.out.println(t.countword("man"));

	}

}
