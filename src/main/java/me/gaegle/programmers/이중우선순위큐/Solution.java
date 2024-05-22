package me.gaegle.programmers.이중우선순위큐;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

class Solution {
	int[] solution(String[] operations) {
		PriorityQueue priorityQueue = new PriorityQueue();
		return priorityQueue.result(operations);
	}

	class PriorityQueue {
		private Queue<Integer> queue = new LinkedList<>();

		int[] result(String[] operations) {
			for (String operation : operations) {
				calculate(operation);
			}
			return maxAndMinArray();
		}

		private void calculate(String operation) {
			String[] split = operation.split(" ");
			int value = Integer.parseInt(split[1]);

			if ("I".equals(split[0])) {
				queue.add(value);
				return;
			}

			if (queue.isEmpty()) {
				return;
			}

			if (value > 0) {
				max().ifPresent(queue::remove);
				return;
			}
			min().ifPresent(queue::remove);
		}

		private int[] maxAndMinArray() {
			if (queue.isEmpty()) {
				return new int[] {0, 0};
			}
			return new int[] {
				max().get().intValue(),
				min().get().intValue()
			};
		}

		private Optional<Integer> min() {
			return queue.stream()
				.min(Comparator.naturalOrder());
		}

		private Optional<Integer> max() {
			return queue.stream()
				.max(Comparator.naturalOrder());
		}
	}
}
