package me.gaegle.programmers.피로도;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		int result = solution.solution(80, new int[][]{{80,20}, {50,40}, {30,10}});
		assertThat(result).isEqualTo(3);
	}
}
