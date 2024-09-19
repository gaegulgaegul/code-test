package me.gaegle.programmers.최소직사각형;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 */
public class Solution {

	public int solution(int[][] sizes) {
		int maxWidth = 0;
		int maxHeight = 0;

		/*
		 * 문제의 핵심은 명함을 뒤집을 수 있다는 것!
		 *
		 * 가로 -> 주어진 가로, 세로 중 큰 값
		 * 세로 -> 주어진 가로, 세로 중 작은 값
		 */
		for (int[] size : sizes) {
			int width = Math.max(size[0], size[1]);
			int height = Math.min(size[0], size[1]);

			maxWidth = Math.max(maxWidth, width);
			maxHeight = Math.max(maxHeight, height);
		}

		return maxWidth * maxHeight;
	}
}
