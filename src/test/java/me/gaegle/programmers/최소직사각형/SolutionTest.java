package me.gaegle.programmers.최소직사각형;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void 예제1() {
		Solution solution = new Solution();
		int[][] sizes = {
			new int[]{60, 50},
			new int[]{30, 70},
			new int[]{60, 30},
			new int[]{80, 40},
		};
		assertThat(solution.solution(sizes)).isEqualTo(4000);
	}

	@Test
	void 예제2() {
		Solution solution = new Solution();
		int[][] sizes = {
			new int[]{10, 7},
			new int[]{12, 3},
			new int[]{8, 15},
			new int[]{14, 7},
			new int[]{5, 15},
		};
		assertThat(solution.solution(sizes)).isEqualTo(120);
	}

	@Test
	void 예제3() {
		Solution solution = new Solution();
		int[][] sizes = {
			new int[]{14, 4},
			new int[]{19, 6},
			new int[]{6, 16},
			new int[]{18, 7},
			new int[]{7, 11},
		};
		assertThat(solution.solution(sizes)).isEqualTo(133);
	}
}