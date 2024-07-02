package me.gaegle.programmers.전력망을_둘로_나누기;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/86971
 */
public class Solution {
	/* 노드 개수 n에 따른 그래프의 인접 리스트 저장 배열 */
	List<Integer>[] graph;
	/* 트리의 최소 크기 */
	int min;

	public int solution(int n, int[][] wires) {
		/* 그래프 초기화 */
		this.graph = new ArrayList[n+1];
		this.min = Integer.MAX_VALUE;

		/*
		 * 송전탑 개수 만큼 그래프에 리스트 추가
		 * 1부터 시작하는 이유 -> wires는 [1 ≤ v1 < v2 ≤ n]의 자연수를 가진다.
		 */
		for (int i = 1; i <= n; i++) {
			this.graph[i] = new ArrayList<>();
		}

		/*
		 * 양방향 간선 추가
		 * wires 배열을 순회하면서 간선 정보를 graph 배열에 추가한다.
		 */
		for (int i = 0; i < wires.length; i++) {
			int v1 = wires[i][0];
			int v2 = wires[i][1];
			this.graph[v1].add(v2);
			this.graph[v2].add(v1);
		}

		for (int i = 0; i < wires.length; i++) {
			int v1 = wires[i][0];
			int v2 = wires[i][1];

			/* 각 노드의 방문 여부를 나타내기 위한 배열 */
			boolean[] visited = new boolean[n + 1];

			/*
			 * 입력된 간선을 하나씩 제거하면서 그래프를 두개의 그룹으로 분리
			 * Integer.valueOf() 적용 이유
			 *   - remove(int index): 주어진 인덱스에 있는 요소를 제거합니다.
			 *   - remove(Object o): 주어진 객체와 일치하는 첫 번째 요소를 제거합니다.
			 */
			this.graph[v1].remove(Integer.valueOf(v2));
			this.graph[v2].remove(Integer.valueOf(v1));

			/* 시작점에서 각 그룹의 노드 개수 계산 */
			int cnt = dfs(1, visited);

			/* 그룹의 노드 개수 차이를 구하고, 최소 트리 크기(min) 갱신 */
			int diff = Math.abs(cnt - (n - cnt));
			this.min = Math.min(diff, this.min);

			/* 제거한 단선을 다시 graph에 추가하고 다음 간선을 제거하면서 계산 진행 */
			this.graph[v1].add(v2);
			this.graph[v2].add(v1);
		}

		return this.min;
	}

	private int dfs(int i, boolean[] visited) {
		/* 현재 노드 방문 */
		visited[i] = true;
		int cnt = 1;

		/* 인접한 노드를 순회하면서 방문하지 않은 노드들을 탐색 */
		for (int next : this.graph[i]) {
			if (!visited[next]) {
				cnt += dfs(next, visited);
			}
		}
		return cnt;
	}
}
