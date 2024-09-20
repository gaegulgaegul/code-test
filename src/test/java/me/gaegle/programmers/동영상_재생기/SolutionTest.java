package me.gaegle.programmers.동영상_재생기;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {

	@Test
	void 예제1() {
		Solution solution = new Solution();
		String result = solution.solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"});
		assertThat(result).isEqualTo("13:00");
	}

	@Test
	void 예제2() {
		Solution solution = new Solution();
		String result = solution.solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev", "next", "next"});
		assertThat(result).isEqualTo("06:55");
	}

	@Test
	void 예제3() {
		Solution solution = new Solution();
		String result = solution.solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"});
		assertThat(result).isEqualTo("04:17");
	}

	@Test
	void 예제4() {
		Solution solution = new Solution();
		String result = solution.solution("34:33", "09:50", "10:00", "13:00", new String[]{"next", "next", "next", "prev"});
		assertThat(result).isEqualTo("13:10");
	}

}
