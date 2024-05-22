package me.gaegle.programmers.올바른_괄호;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {

	@Test
	void 잘못된_케이스_1() {
		var solution = new Solution();
		boolean result = solution.solution(")()(");
		assertThat(result).isFalse();
	}

	@Test
	void 잘못된_케이스_2() {
		var solution = new Solution();
		boolean result = solution.solution("(()(");
		assertThat(result).isFalse();
	}

	@Test
	void 잘못된_케이스_3() {
		var solution = new Solution();
		boolean result = solution.solution("(()");
		assertThat(result).isFalse();
	}

	@Test
	void 잘못된_케이스_4() {
		var solution = new Solution();
		boolean result = solution.solution("");
		assertThat(result).isFalse();
	}

	@Test
	void 성공_케이스_1() {
		var solution = new Solution();
		boolean result = solution.solution("()()");
		assertThat(result).isTrue();
	}

	@Test
	void 성공_케이스_2() {
		var solution = new Solution();
		boolean result = solution.solution("(())()");
		assertThat(result).isTrue();
	}
}
