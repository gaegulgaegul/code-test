package me.gaegle.programmers.디스크_컨트롤러;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
	int solution(int[][] jobs) {
		DiskController diskController = new DiskController();
		return diskController.process(jobs);
	}

	class DiskController {
		private PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
		private int count = 0;
		private int index = 0;
		private int end = 0;
		private int total = 0;

		int process(int[][] jobs) {
			Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

			while (count < jobs.length) {
				while (index < jobs.length && jobs[index][0] <= end) {
					queue.add(jobs[index++]);
				}

				if (queue.isEmpty()) {
					end = jobs[index][0];
					continue;
				}

				int[] poll = queue.poll();
				total += poll[1] + end - poll[0];
				end += poll[1];
				count++;
			}

			return total / jobs.length;
		}
	}

}
