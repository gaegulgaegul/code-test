package me.gaegle.programmers.동영상_재생기;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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

	/**
	 * https://school.programmers.co.kr/learn/courses/30/lessons/340213
	 */
	private class Solution {

		public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
			String[] currentTimes = pos.split(":");
			String[] lastTimes = video_len.split(":");
			String[] openingStartTimes = op_start.split(":");
			String[] openingEndTimes = op_end.split(":");

			LocalTime currentTime = LocalTime.of(0, Integer.parseInt(currentTimes[0]), Integer.parseInt(currentTimes[1]));
			LocalTime lastTime = LocalTime.of(0, Integer.parseInt(lastTimes[0]), Integer.parseInt(lastTimes[1]));
			LocalTime openingStartTime = LocalTime.of(0, Integer.parseInt(openingStartTimes[0]),
				Integer.parseInt(openingStartTimes[1]));
			LocalTime openingEndTime = LocalTime.of(0, Integer.parseInt(openingEndTimes[0]),
				Integer.parseInt(openingEndTimes[1]));

			for (String command : commands) {
				if (currentTime.isAfter(openingStartTime) && currentTime.isBefore(openingEndTime)) {
					currentTime = LocalTime.from(openingEndTime);
				}

				switch (command) {
					case "next":
						currentTime = currentTime.plusSeconds(10);

						if (currentTime.isAfter(lastTime)) {
							currentTime = lastTime;
						}
						break;
					case "prev":
						currentTime = currentTime.minusSeconds(10);

						LocalTime startTime = LocalTime.of(0, 0, 0);
						if (currentTime.getHour() != 0) {
							currentTime = startTime;
						}
						break;
				}

				if (currentTime.isAfter(openingStartTime) && currentTime.isBefore(openingEndTime)) {
					currentTime = LocalTime.from(openingEndTime);
				}
			}

			return currentTime.format(DateTimeFormatter.ofPattern("mm:ss"));
		}
	}
}
