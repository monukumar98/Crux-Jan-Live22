package Lec52;

import java.util.ArrayList;

public class Generic_Heap<T extends Comparable<T>> {
	private ArrayList<T> data = new ArrayList<>();

	public void add(T item) {

		this.data.add(item);
		upheapify(this.data.size() - 1);

	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		// if (this.data.get(pi) > this.data.get(ci)) {
		if (islarger(this.data.get(ci), this.data.get(pi)) > 0) {// islagre(x,y)
			Swap(pi, ci);
			upheapify(pi);
		}

	}

	public void Swap(int i, int j) {

		T ith = this.data.get(i);// 20
		T jth = this.data.get(j);// 40
		this.data.set(i, jth);
		this.data.set(j, ith);

	}

	public T remove() {
		Swap(0, this.data.size() - 1);
		T rv = this.data.remove(this.data.size() - 1);
		downheapify(0);

		return rv;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < this.data.size() && islarger(this.data.get(lci), this.data.get(mini)) > 0) {
			mini = lci;
		}
		if (rci < this.data.size() && islarger(this.data.get(rci), this.data.get(mini)) > 0) {
			mini = rci;
		}
		if (mini != pi) {
			Swap(mini, pi);
			;
			downheapify(mini);
		}

	}

	public T getmin() {

		return this.data.get(0);

	}

	public int size() {
		return this.data.size();
	}

	public void display() {
		System.out.println(this.data);
	}

	public int islarger(T o1, T o2) {
		return o1.compareTo(o2);

	}
}