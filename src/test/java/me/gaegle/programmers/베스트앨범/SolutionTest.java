package me.gaegle.programmers.베스트앨범;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void 테스트() {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		Solution solution = new Solution();
		int[] answer = solution.solution(genres, plays);
		Arrays.stream(answer).forEach(System.out::println);
		assertArrayEquals(answer, new int[]{4, 1, 3, 0});
	}
}