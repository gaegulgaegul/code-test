package me.gaegle.programmers.이중우선순위큐;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {

	@Test
	void 예시1() {
		Solution solution = new Solution();
		String[] strings = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
		int[] result = solution.solution(strings);
		assertThat(result).isEqualTo(new int[]{0, 0});
	}

	@Test
	void 예시2() {
		Solution solution = new Solution();
		String[] strings = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		int[] result = solution.solution(strings);
		assertThat(result).isEqualTo(new int[]{333, -45});
	}
}
