package Com.GreatLearning.Q1.Service;

import java.util.PriorityQueue;

public class Service {
	public void printConstructionTable(int floor[]) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
		int max = floor.length;
		System.out.println("THE ORDER OF THE CONSTRUCTION IS AS FOLLOWS");
		for (int i = 0; i < floor.length; i++) {
			System.out.println("DAY:" + (i + 1));
			queue.add(floor[i]);

			while (!queue.isEmpty() && queue.peek() == max) {
				System.out.println(queue.poll() + " ");
				max--;
			}
			System.out.println();
		}
	}

}
