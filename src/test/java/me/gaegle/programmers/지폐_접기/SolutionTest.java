package me.gaegle.programmers.지폐_접기;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {

	@Test
	void 예제1() {
		Solution solution = new Solution();
		int result = solution.solution(new int[]{30, 15}, new int[]{26, 17});
		assertThat(result).isEqualTo(1);
	}

	@Test
	void 예제2() {
		Solution solution = new Solution();
		int result = solution.solution(new int[]{50, 50}, new int[]{100, 241});
		assertThat(result).isEqualTo(4);
	}

}
