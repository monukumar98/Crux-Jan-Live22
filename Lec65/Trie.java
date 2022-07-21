package Lec65;

import java.util.HashMap;

public class Trie {

	public class Node {

		char data;
		HashMap<Character, Node> children = new HashMap<>();
		boolean isterminal = false;
		int count = 0;

		public Node(char c) {
			// TODO Auto-generated constructor stub
			this.data = c;
			this.count = 1;
		}

	}

	private Node root;

	public Trie() {
		// TODO Auto-generated constructor stub
		Node nn = new Node('*');
		this.root = nn;
	}

	public void insert(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.children.containsKey(ch)) {
				curr = curr.children.get(ch);
				curr.count = curr.count + 1;
			} else {
				Node nn = new Node(ch);
				curr.children.put(ch, nn);
				curr = nn;

			}

		}

		curr.isterminal = true;// color yaha Word end ho raha h

	}

	public boolean search(String word) {
		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!curr.children.containsKey(ch)) {
				return false;
			} else {

				curr = curr.children.get(ch);

			}

		}
		return curr.isterminal;
	}

	public boolean startsWith(String prefix) {
		Node curr = this.root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (!curr.children.containsKey(ch)) {
				return false;
			} else {

				curr = curr.children.get(ch);

			}

		}
		return true;
	}

	public int countword(String word) {

		Node curr = this.root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!curr.children.containsKey(ch)) {
				return 0;
			} else {

				curr = curr.children.get(ch);

			}

		}
		return curr.count;
		

	}

}
