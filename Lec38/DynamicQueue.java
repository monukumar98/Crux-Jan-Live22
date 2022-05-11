package Lec38;

import Lec37.Queue;

public class DynamicQueue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {

		if (super.isfull()) {
			int[] arr = new int[2 * super.data.length];

			for (int i = 0; i < super.data.length; i++) {
				int idx = (this.front + i) % this.data.length;
				arr[i] = data[idx];

			}
			this.data = arr;
			this.front = 0;
		}
		super.Enqueue(item);

	}

}
