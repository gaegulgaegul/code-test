package me.gaegle.programmers.디스크_컨트롤러;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {

	@Test
	void 예시() {
		Solution solution = new Solution();
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		int result = solution.solution(jobs);
		assertThat(result).isEqualTo(9);
	}
}
