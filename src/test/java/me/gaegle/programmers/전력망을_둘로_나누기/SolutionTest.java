package me.gaegle.programmers.전력망을_둘로_나누기;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void 예제1() {
		Solution solution = new Solution();
		int result = solution.solution(9, new int[][]{
			new int[]{1,3},
			new int[]{2,3},
			new int[]{3,4},
			new int[]{4,5},
			new int[]{4,6},
			new int[]{4,7},
			new int[]{7,8},
			new int[]{7,9}
		});
		assertThat(result).isEqualTo(3);
	}

	@Test
	void 예제2() {
		Solution solution = new Solution();
		int result = solution.solution(4, new int[][]{
			new int[]{1,2},
			new int[]{2,3},
			new int[]{3,4}
		});
		assertThat(result).isEqualTo(0);
	}

	@Test
	void 예제3() {
		Solution solution = new Solution();
		int result = solution.solution(7, new int[][]{
			new int[]{1,2},
			new int[]{2,7},
			new int[]{3,7},
			new int[]{3,4},
			new int[]{4,5},
			new int[]{6,7}
		});
		assertThat(result).isEqualTo(1);
	}
}
