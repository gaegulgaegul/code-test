package me.gaegle.programmers.전력망을_둘로_나누기;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/86971
 */
public class Solution {
	List<Integer>[] graph;
	int min;

	public int solution(int n, int[][] wires) {
		this.graph = new ArrayList[n+1];
		this.min = Integer.MAX_VALUE;

		for (int i = 1; i <= n; i++) {
			this.graph[i] = new ArrayList<>();
		}

		for (int i = 0; i < wires.length; i++) {
			int v1 = wires[i][0];
			int v2 = wires[i][1];
			this.graph[v1].add(v2);
			this.graph[v2].add(v1);
		}

		for (int i = 0; i < wires.length; i++) {
			int v1 = wires[i][0];
			int v2 = wires[i][1];

			boolean[] visited = new boolean[n + 1];

			this.graph[v1].remove(Integer.valueOf(v2));
			this.graph[v2].remove(Integer.valueOf(v1));

			int cnt = dfs(1, visited);

			int diff = Math.abs(cnt - (n - cnt));
			this.min = Math.min(diff, this.min);

			this.graph[v1].add(v2);
			this.graph[v2].add(v1);
		}

		return this.min;
	}

	private int dfs(int i, boolean[] visited) {
		visited[i] = true;
		int cnt = 1;

		for (int next : this.graph[i]) {
			if (!visited[next]) {
				cnt += dfs(next, visited);
			}
		}
		return cnt;
	}
}
