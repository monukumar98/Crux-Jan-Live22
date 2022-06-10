package Lec51;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> data = new ArrayList<>();

	public void add(int item) {

		this.data.add(item);
		upheapify(this.data.size() - 1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (this.data.get(pi) > this.data.get(ci)) {
			Swap(pi, ci);
			upheapify(pi);
		}

	}

	public void Swap(int i, int j) {

		int ith = this.data.get(i);// 20
		int jth = this.data.get(j);// 40
		this.data.set(i, jth);
		this.data.set(j, ith);

	}

	public int remove() {
		Swap(0, this.data.size() - 1);
		int rv = this.data.remove(this.data.size() - 1);
		downheapify(0);

		return rv;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < this.data.size() && this.data.get(lci) < this.data.get(mini)) {
			mini = lci;
		}
		if (rci < this.data.size() && this.data.get(rci) < this.data.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			Swap(mini, pi);
			;
			downheapify(mini);
		}

	}

	public int getmin() {

		return this.data.get(0);

	}

	public int size() {
		return this.data.size();
	}

	public void display() {
		System.out.println(this.data);
	}
}
